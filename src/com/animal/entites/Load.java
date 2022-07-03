package com.animal.entites;

public class Load {
   // Load degen klass tuzunuz anin:height,width,weight degen poleleri bolsun.
    private int height;
    private int width;
    private int weight;

    public Load(int height, int width, int weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Load{" +
                "height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}
