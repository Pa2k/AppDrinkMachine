package com.example.appdrinkmachine.model;

public class MyDrinkData {
    private int drinkImage;
    private String drinkPrice;
    private String drinkName;
    public MyDrinkData(String drinkName, String drinkPrice, int drinkImage){
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkImage = drinkImage;

    }
    public int getDrinkImage() {
        return drinkImage;
    }

    public void setDrinkImage(int drinkImage) {
        this.drinkImage = drinkImage;
    }

    public String getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(String drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }


}
