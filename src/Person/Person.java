package Person;

public class Person{
    protected String name;
    protected String address;

    public Person(){}

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }


    public void display(){
        System.out.println(" - Name: " + name);
        System.out.println(" - Address: " + address);
    }
}