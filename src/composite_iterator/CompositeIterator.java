package composite_iterator;
import java.util.*;


// CompositeIterator: 복합 객체 안에 있는 MenuItem에 대한 반복 작업을 할 수 있게 해주는 기능 제공
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator); // iterator push
    }

    public MenuComponent next() {
        if (hasNext()) {
            Iterator iterator = (Iterator)stack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            if(component instanceof Menu){  // 메뉴인 경우, 하위메뉴를 스택에 삽입
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();   // 스택 가장 위에 원소
            if (!iterator.hasNext()) {  // 해당 원소가 다음 원소가 없는 경우, pop하고 hasNext()
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

}


