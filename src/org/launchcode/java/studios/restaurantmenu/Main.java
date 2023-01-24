package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MenuItem apple = new MenuItem(1.05, "tasty fruit", "appitizer");
        MenuItem chicken = new MenuItem(10.25, "meat", "main course");
        MenuItem pudding = new MenuItem(5.15, "chocolate", "dessert");
        MenuItem apple2 = new MenuItem(1.05, "tasty fruit", "appitizer");

        System.out.println(chicken.getDate());
        System.out.println(pudding.getDate());

        ArrayList<MenuItem> menuList = new ArrayList<>();
        menuList.add(apple);
        menuList.add(chicken);
        menuList.add(pudding);

        Menu mainMenu = new Menu(menuList);
        mainMenu.viewMenu();
        System.out.println(apple.equals(apple2));
    }
}
