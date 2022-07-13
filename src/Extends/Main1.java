package Extends;

import com.HomeWork.Singer;

public class Main1 {
    public static void main(String[] args) {
        Pragrommer pragrommer =new Pragrommer("Zarip","Programmer","PeakSoft");
        Dancer dancer = new Dancer("Zarina", "Dancer","","Nazik");
        Singer singer =new Singer("Aigul", "Yrchy","SaikalKG");


        System.out.println(pragrommer +" Company Name " +pragrommer.getCompany());
        pragrommer.programm();
        pragrommer.programm1();
        pragrommer.programm2();
        pragrommer.programm3();
        System.out.println("_____________________");


        System.out.println(dancer+ " Group Name " + dancer.getGrupname());
        dancer.danc();
        dancer.danc2();
        dancer.dance3();
        dancer.dance4();
        System.out.println("___________________");

        System.out.println(singer+ " Group Name " + singer.getGrupname1());
        singer.sing();
        singer.sing2();
        singer.sing3();
        singer.sing4();


            }

}

