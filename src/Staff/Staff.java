package Staff;
import Person.Person;

public class Staff extends Person{
    private String school;
    private double salary;

    public Staff(){
    }

    public Staff(String name, String address, String school, double salary){
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getSchool(){
        return school;
    }

    public double getSalary(){
        return salary;
    }

    @Override //ghi de
    public void display() {
        super.display();
        System.out.println(" - School: " + school);
        System.out.println(" - Salary: " + salary);
    }
}
    
