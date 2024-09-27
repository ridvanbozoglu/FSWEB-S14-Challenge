package org.example;

import org.example.models.DeluxeBurger;
import org.example.models.Hamburger;
import org.example.models.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");

        healthyBurger.addHealthyAddition1("test", 2);
        healthyBurger.addHealthyAddition2("test", 2);

        System.out.println(healthyBurger.getPrice());



    }
}