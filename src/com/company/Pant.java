package com.company;

public class Pant {
    private double size;
    private String color;
    private String brand;
    private String texture;
    private boolean hasPockets;

    public Pant (){

    }
    public Pant (double size,String color,String brand,String texture,boolean hasPockets){
        this.size=size;
        this.color=color;
        this.brand=brand;
        this.texture=texture;
        this.hasPockets=true;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public boolean isHasPockets() {
        return hasPockets;
    }

    public void setHasPockets(boolean hasPockets) {
        this.hasPockets = hasPockets;
    }
    @Override
    public String toString(){

        return this.size +" " + " "+ this.color + " " + this.texture + " "+ this.hasPockets;
    }
}
