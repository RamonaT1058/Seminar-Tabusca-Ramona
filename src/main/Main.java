package main;

import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1;
        singleton1 = Singleton.returnareInstanta();
        Singleton singleton2;
        singleton2 =  Singleton.returnareInstanta();
        System.out.println(singleton1);
        System.out.println(singleton2);

    }
}
