package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public double getDefaultPrice(){
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }


    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }


    public double itemizeHamburger(){
        System.out.println(getDetails());
        return getPrice();
    }

    public double getPrice() {
        double totalPrice = this.price;
        if (addition1Price > 0) totalPrice += addition1Price;
        if (addition2Price > 0) totalPrice += addition2Price;
        if (addition3Price > 0) totalPrice += addition3Price;
        if (addition4Price > 0) totalPrice += addition4Price;
        return totalPrice;
    }

    private String getDetails() {
        StringBuilder details = new StringBuilder("Hamburger: " + name + ", Meat: " + meat + ", Bread Roll Type: " + breadRollType + ", Base Price: " + price);
        if (addition1Name != null) details.append(", Addition 1: ").append(addition1Name).append(" ($").append(addition1Price).append(")");
        if (addition2Name != null) details.append(", Addition 2: ").append(addition2Name).append(" ($").append(addition2Price).append(")");
        if (addition3Name != null) details.append(", Addition 3: ").append(addition3Name).append(" ($").append(addition3Price).append(")");
        if (addition4Name != null) details.append(", Addition 4: ").append(addition4Name).append(" ($").append(addition4Price).append(")");
        return details.toString();
    }

}
