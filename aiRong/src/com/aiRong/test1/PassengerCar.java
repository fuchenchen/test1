package com.aiRong.test1;

/**
 * @author:fuchenchen
 * @create:
 **/

public class PassengerCar extends Car {
    private double pcount;

    public PassengerCar(double price, double pcount) {
        super(price);
        this.pcount = pcount;
    }

    public double getPcount() {
        return pcount;
    }

    public void setPcount(double pcount) {
        this.pcount = pcount;
    }
}
