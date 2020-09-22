package com.my.test.bean;

public class Apple {
    private String origin;
    private int id;
    private String color;
    private int weight;

    public Apple(String origin, int id, String color, int weight) {
        this.origin = origin;
        this.id = id;
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "origin='" + origin + '\'' +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
