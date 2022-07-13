package Extends;

public class Pragrommer extends Person{
    private String company;

    public String getCompany() {

        return company;
    }

    public void setCompany(String company) {
        this.company = company;

    }

    public Pragrommer(String name, String designation, String company) {
        super(name, designation,company);

    }
    void programm(){
        System.out.println("Okui alat");
    }
    void programm1(){
        System.out.println("Gulayt etet");

    }
    void programm2(){
        System.out.println("Tamak jeit");
    }
    void programm3(){
        System.out.println("Kod jaza alat");
    }
}
