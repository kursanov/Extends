package com.HomeWork;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(4);
        cat.setColor("sary");
        cat.setPoroda("Egypetski");

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(cat.getPoroda());
        System.out.println("\n");

        Fish fish = new Fish();
        fish.setName("balyk");
        fish.setAge(2);
        fish.setColor("seryi");
        fish.setPoroda("farel");

        System.out.println(fish.getName());
        System.out.println(fish.getAge());
        System.out.println(fish.getColor());
        System.out.println(fish.getPoroda());


        Poper poper = new Poper();
        poper.setName("papugai");
        poper.setAge(7);
        poper.setColor("kara");
        poper.setPoroda("amazon");

        System.out.println(poper.getName());
        System.out.println(poper.getAge());
        System.out.println(poper.getColor());
        System.out.println(poper.getPoroda());
        System.out.println("\n");

        Doc doc = new Doc();
        doc.setName("Rexs");
        doc.setAge(4);
        doc.setColor("kara");
        doc.setPoroda("Afcherka");

        System.out.println(doc.getName());
        System.out.println(doc.getAge());
        System.out.println(doc.getColor());
        System.out.println(doc.getPoroda());
        System.out.println("\n");


    }

}