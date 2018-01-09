package com.aiRong.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:fuchenchen
 * @create:
 **/

public class GoodsCar extends  Car{
   private double load;

    public GoodsCar() {
    }

    public double getLoad() {
        return load;
    }

    public GoodsCar(double load,double price) {
        super(price);
        this.load = load;
    }

   /* public GoodsCar(double price, String brand, String color, double load) {
        super(price, brand, color);
        this.load = load;
    }*/

   /* public void goodsCars(){
    List list=new ArrayList();,
    GoodsCar cars=new GoodsCar();
    list.add(new GoodsCar(50,"东风一号","黑色",5));
    list.add(new GoodsCar(55,"东风二号","蓝色",6));
    list.add(new GoodsCar(60,"东风三号","灰色",7));

}*/

}
