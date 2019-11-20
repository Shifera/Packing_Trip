package com.company;

public class Shirt {

        private double size;
        private String color;
        private String brand;
        private String texture;
        private String sleeves;
        private boolean hasPockets;

    public Shirt (){

        }

    public Shirt (double size,String color,String brand,String texture,String sleeves,boolean hasPockets){
        this.size=size;
        this.color=color;
        this.brand=brand;
        this.texture=texture;
        this.sleeves=sleeves;
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

    public String getSleeves() {
        return sleeves;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    public boolean isHasPockets() {
        return hasPockets;
    }

    public void setHasPockets(boolean hasPockets) {
        this.hasPockets = hasPockets;
    }
    @Override
    public String toString(){

        return this.size +" " + " "+ this.color + " " + this.texture + " " + this.sleeves + " "+ this.hasPockets;
    }
}

