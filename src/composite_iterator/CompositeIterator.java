package composite_iterator;
import java.util.*;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack stack = new Stack();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
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
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

}


