package com.abhishek.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4.6, 7.9, 9.9);
//        Box box2 = new Box(box); // copy constructor called

        System.out.println(box.l);
        System.out.println(box.w);
        System.out.println(box.h);

        BoxWeight box3 = new BoxWeight();

        System.out.println(box3.h + " " + box3.weight);

    }
}
