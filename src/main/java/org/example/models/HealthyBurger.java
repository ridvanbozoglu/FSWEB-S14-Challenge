package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name,  double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name= name;
        healthyExtra1Price=price;
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name= name;
        healthyExtra2Price=price;
    }

    public double itemizeHamburger(){
        System.out.println(this);
        return getPrice();
    }

    @Override
    public String toString() {
        return "HealthyBurger{" +
                "healthyExtra1Name='" + healthyExtra1Name + '\'' +
                ", healthyExtra2Name='" + healthyExtra2Name + '\'' +
                ", healthyExtra1Price=" + healthyExtra1Price +
                ", healthyExtra2Price=" + healthyExtra2Price +
                '}';
    }

    @Override
    public double getPrice() {
        double totalPrice = getDefaultPrice();
        if (healthyExtra1Price > 0) totalPrice += healthyExtra1Price;
        if (healthyExtra2Price > 0) totalPrice += healthyExtra2Price;
        return totalPrice;
    }

    private String getDetails() {
        StringBuilder details = new StringBuilder("Hamburger: " + getName() + ", Meat: " + getMeat() + ", Bread Roll Type: " + getBreadRollType() + ", Base Price: " + getPrice());
        if (healthyExtra1Name != null) details.append(", Addition 1: ").append(healthyExtra1Name).append(" ($").append(healthyExtra1Name).append(")");
        if (healthyExtra2Name != null) details.append(", Addition 2: ").append(healthyExtra2Name).append(" ($").append(healthyExtra2Name).append(")");
        return details.toString();
    }
}
