package com.company;

public class Main {

    public static void main(String[] args) {
Closet closet=new Closet();

closet.addJacket();
closet.addShirt();
closet.addPant();
closet.addFootWear();




System.out.println(" Jacket is: "+ closet.getJacket());

System.out.println(" Shirt is: " +closet.getShirt());

System.out.println("Pant is: "+ closet.getPant());

System.out.println("Foot wear is: " + closet.getPant());

    }
}
