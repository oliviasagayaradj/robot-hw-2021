package com.company;

import java.util.Scanner;
public class hw_assign2 {

    public static void main(String[] args) {
     Scanner myPizza = new Scanner(System.in);
     System.out.println("Input your name:");
     String name = myPizza.nextLine();
     System.out.println("Input the number of pizza's you are ordering:");
     String x = myPizza.nextLine();
     System.out.println("Input how many grams of pepperoni you would like:");
     String y = myPizza.nextLine();
     System.out.println("Input what ype of crust you would like:");
     String z = myPizza.nextLine();
     System.out.println(name + "ordered" + x + "pizzas with" + y + "g of pepperonis and" + z +"crust.");

    }
}
