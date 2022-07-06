package com.HomeWork;

public class Doc {
    private String name;
    private int age;
    private String color;
    private String poroda;

    void setName(String DocName){
        this.name = DocName;
    }
    void setAge(int DocAge){
        this.age = DocAge;
    }
    void setColor(String DocColor){
        this.color = DocColor;

    }
    void setPoroda(String DocPoroda) {
        this.poroda = DocPoroda;

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
