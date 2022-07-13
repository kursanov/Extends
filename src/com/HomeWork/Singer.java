package com.HomeWork;

import Extends.Person;

public class Singer extends Person {
    private String grupname1;

    public String getGrupname1() {

        return grupname1;
    }

    public void setGrupname1(String grupname1) {
        this.grupname1 = grupname1;
    }

    public Singer(String name, String designation, String grupname1) {
        super(name, designation, grupname1);

    }

    public void sing() {
        System.out.println("Okui alat");
    }

    public void sing2() {
        System.out.println("Gulayt etet");

    }

    public void sing3() {
        System.out.println("Tamak jeit");
    }

    public void sing4() {
        System.out.println("yrdai alat");
    }
}