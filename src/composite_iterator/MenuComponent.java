package composite_iterator;
import java.util.*;

// MenuComponent: Component로 복합노드(폴더) + 잎 노드(파일) 정의 인터페이스
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }
    public abstract Iterator createIterator();   // 예를들어 채식주의자용 메뉴 항목을 뽑을 때 필요
}
