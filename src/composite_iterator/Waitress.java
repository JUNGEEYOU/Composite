package composite_iterator;

import java.util.Iterator;

// Waitress: 클라이언트로 MenuComponent를 사용
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {   // 최상위 메뉴만 전달 받음!!
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();

        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();   //
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}  //  menu인 경우 isVegetarian 예외처리되서 다음것으로 넘어감
        }
    }
}
