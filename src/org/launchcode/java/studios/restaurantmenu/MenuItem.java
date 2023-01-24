package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public double getPrice(){return price;}
    public String getDescription(){return description;}
    public String getCategory(){return category;}
    public void setPrice(double aprice){price = aprice;}
    public void setDescription(String adescription){description=adescription;}
    public void setCategory(String acategory){category = acategory;}
    public MenuItem(double price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
    }
    public void setDate(Date now){
        this.dateAdded = new Date();
    }
    public Date getDate(){return dateAdded;}

    public void isNew(){
        Date currentDate = new Date();
        int dateAddedMonth = (int) this.dateAdded.getTime();
        int currentDateMonth = (int) currentDate.getTime();
        if(currentDateMonth-dateAddedMonth <= 604800000){
            System.out.println("menu item is new");
        } else {
            System.out.println("menu item is not new");
        }
    }

    public boolean equals(Object toBeCompared){
        if(toBeCompared.getClass() != getClass()){
            return false;
        }

        if(toBeCompared == null){
            return false;
        }

        if(toBeCompared == this){
            return true;
        }

        MenuItem food = (MenuItem) toBeCompared;
        boolean logic1 = food.getCategory() == this.getCategory();
        boolean logic2 = food.getDescription() == this.getDescription();
        boolean logic3 = food.getPrice() == this.getPrice();
        if(logic1 && logic2 && logic3){
            return true;
        } else {
            return false;
        }
    }

}
