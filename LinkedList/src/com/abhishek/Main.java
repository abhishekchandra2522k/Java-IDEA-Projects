package com.abhishek;

public class Main {
    public static void main(String[] args) {
        LL list = new LL(0);

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();
    }
}
