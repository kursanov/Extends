package Extends;

public class Dancer extends  Person{
    private String grupname;

    public String getGrupname() {
        return grupname;
    }

    public void setGrupname(String grupname) {
        this.grupname = grupname;
    }

    public Dancer(String name, String designation, String company, String grupname) {
        super(name, designation, grupname);

    }
    void danc(){
        System.out.println("Okui alat");
    }
    void danc2(){
        System.out.println("Gulayt etet");

    }
    void dance3(){
        System.out.println("Tamak jeit");
    }
    void dance4(){
        System.out.println("Biylei alat");
    }
}

