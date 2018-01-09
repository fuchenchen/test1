package com.aiRong.fcc;

/**
 * @author:fuchenchen
 * @create:
 **/

public class Boy extends Student {

    public Boy(int age, String name) {
        super(age, name);
    }

    void study(){
        System.out.println(getName()+" study every day");
    }
}
