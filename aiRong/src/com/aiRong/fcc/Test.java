package com.aiRong.fcc;

/**
 * @author:fuchenchen
 * @create:
 **/

public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("Tom");
        stu.run();
        Boy boy=new Boy(18,"Sam");
        boy.run();
        boy.study();


    }


}
