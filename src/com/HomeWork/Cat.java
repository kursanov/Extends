package com.HomeWork;

public class Cat {

    private String name;
    private int age;
    private String color;
    private String poroda;


    void setName(String CatName){
       this.name = CatName;
    }
    void setAge(int CatAge){
        this.age = CatAge;
    }
    void setColor(String CatColor){
        this.color = CatColor;

    }
    void setPoroda(String CatPoroda){
        this.poroda = CatPoroda;

    }String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
    String getColor(){
        return color;

    }
    String getPoroda(){
        return poroda;
    }


}
