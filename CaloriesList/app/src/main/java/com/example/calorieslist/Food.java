package com.example.calorieslist;

import java.io.Serializable;

public class Food implements Serializable {
    private String name;
    private double serving;
    private double calories;
    private int img;
    private double fat;
    private double carbohydrates;
    private double protein;

    public Food(String name, double serving, double calories, int img, double fat, double carbohydrates, double protein) {
        this.name = name;
        this.serving = serving;
        this.calories = calories;
        this.img = img;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getServing() {
        return serving;
    }

    public void setServing(double serving) {
        this.serving = serving;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}
