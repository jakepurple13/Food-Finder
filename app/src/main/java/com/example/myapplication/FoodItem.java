package com.example.myapplication;

import java.util.Date;

/**
 * Created by Jacob on 3/18/16.
 */
public class FoodItem {

    String name;
    int quantity;
    Date dateAdded;


    public FoodItem(String name, int amount, Date dateAdded) {

        this.name = name;
        quantity = amount;
        this.dateAdded = dateAdded;

    }

    /*Expiration
      Returns 0 --> if time is within a week
      Returns 1 --> if time is within 2 weeks
      Returns -1 --> if time is 2 weeks and/or more
      Returns 2 --> if something goes wrong
    */
    public int expiration() {

        long time = Math.abs(dateAdded.getTime()-new Date().getTime());
        long seconds = 604800;
        long ms = seconds * 1000;

        if(time < ms) {
            return 0;
        } else if(time > (ms*2)) {
            return -1;
        } else if(time > ms) {
            return 1;
        }
        return 2;
    }

    public boolean isOut() {
        return quantity==0;
    }

    public void removeOne() {
        quantity--;
    }

    public void addOne() {
        quantity++;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return name;

    }

    @Override
    public String toString () {
        return "<item>\n" + name + "\n" + quantity + "\n" + dateAdded + "\n</item>";
    }


}
