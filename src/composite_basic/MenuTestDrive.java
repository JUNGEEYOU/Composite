package composite_basic;

public class MenuTestDrive {

    public static void main(String[] args) {
        // Menu는 복합 노드, MenuItem는 leaf 노드
        // 1. 기본 메뉴 추가 : 팬케이크메뉴, 카페메뉴,
        MenuComponent pancakeHouseMenu =
                new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu =
                new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu =
                new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu =
                new Menu("디저트 메뉴 ", "디저트를 즐기세요!");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        // 2. 복합 객체의 add를 이용하여 각 메뉴들을 추가
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 2. 각 메뉴 항목을 추가
        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem(
                "Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));

        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));
        dinerMenu.add(new MenuItem(
                "Soup of the day",
                "A bowl of the soup of the day, with a side of potato salad",
                false,
                3.29));
        dinerMenu.add(new MenuItem(
                "Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05));
        dinerMenu.add(new MenuItem(
                "Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice",
                true,
                3.99));

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        dessertMenu.add(new MenuItem(
                "Cheesecake",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                1.99));
        dessertMenu.add(new MenuItem(
                "Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));

        // 웨이터에게 최상위 메뉴를 전달
        Waitress waitress = new Waitress(allMenus);
        // 웨이터가 모든 메뉴를 출력
        waitress.printMenu();
    }

}
