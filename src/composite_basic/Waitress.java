package composite_basic;

// Waitress: 클라이언트로 MenuComponent를 사용
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {   // 최상위 메뉴만 전달 받음!!
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
