package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items){
        this.items = items;
        this.lastUpdated = new Date();
    }
    public void addItem(MenuItem food){
        this.items.add(food);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem food){
        if(items.contains(food)){
            items.remove(items.indexOf(food));
            this.lastUpdated = new Date();
        } else {
            System.out.println("item is not on menu");
        }
    }

    public void viewMenuItem(MenuItem item){
        if(items.contains(item)){
            String outlet = String.format("This %s is a %s and will cost %.2f", item.getCategory(), item.getDescription(), item.getPrice());
            System.out.println(outlet);
        } else {
            System.out.println("this item is not on the menu");
        }
    }

    public void viewMenu(){
        for(MenuItem item: items){
            String outlet = String.format("This %s is a %s and will cost %.2f", item.getCategory(), item.getDescription(), item.getPrice());
            System.out.println(outlet);
        }
    }


}
