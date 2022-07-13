package com.HomeWork;

public class Fish {
    private String name;
    private int age;
    private String color;

    public Fish(){

    }

    public Fish(String name,int age,String color){
        this.name =name;
        this.age = age;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getColor(){
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public void setColor(String color){
        this.color = color;
    }
}



