package com.company;

public class Programmer {

    private String name;

    private int age;

    void setName(String ProgrammerName){
        if(ProgrammerName.length() > 10) {
            System.out.println("Kayra jazup korunuz,tamga 15ten kop bolbosun");
        }else {
            this.name = ProgrammerName;
        }
    }
    void setAge(int ProgrammerAge){
        if(ProgrammerAge < 7 )
            System.out.println("Jash 10don chon bolsun");


        else {
            this.age = ProgrammerAge;

        }

    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

    private void coding(){
        System.out.println("Coding with Java");
    }

    void coding1(){
        System.out.println(name);
        System.out.println(age);
        coding();
    }

}
