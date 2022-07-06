package com.HomeWork;

public class Fish {
    private String name;
    private int age;
    private String color;
    private String poroda;

    void setName(String FishName){
        this.name = FishName;
    }
    void setAge(int FithAge){
        this.age = FithAge;
    }
    void setColor(String FithColor){
        this.color = FithColor;

    }
    void setPoroda(String FithPoroda) {
        this.poroda = FithPoroda;

    }
        String getName() {
            return name;
        }


        int getAge () {
            return age;
        }
        String getColor () {
            return color;

        }
        String getPoroda () {
            return poroda;


        }
    }