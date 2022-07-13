package Extends;

public class Person {
    private String name;
    private  String designation;

    public Person (String name, String designation, String company){
        this.name = name;
        this.designation = designation;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;

    }
    void personal(){
        System.out.println("Okui alat");
    }
    void personal1(){
        System.out.println("Gulayt etet");

    }
    void personal3(){
        System.out.println("Tamak jeit");
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", designation=" + designation ;
    }
}
