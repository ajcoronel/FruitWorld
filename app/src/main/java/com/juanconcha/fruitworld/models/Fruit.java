package com.juanconcha.fruitworld.models;

/**
 * Created by jc on 31-12-17.
 */

public class Fruit {

    public String name;
    public int icon;
    public String origin;


    public Fruit(){

    }

    public Fruit(String name, int icon, String origin) {
        this.name = name;
        this.icon = icon;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", icon=" + icon +
                ", origin='" + origin + '\'' +
                '}';
    }
}
