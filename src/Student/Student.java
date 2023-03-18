package Student;

import Person.Person;

public class Student extends Person {
    private String program;
    private int year;
    private double score;

    public Student() {}

    public Student(String name, String address, String program, int year, double score) {
        super(name, address);

        this.program = program;
        this.year = year;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        if (score < 5) return "bad score";
        else if (score >= 5 && score < 8) return "medium score";
        return "good score";
    }

    @Override // ghi de
    public void display() {
        super.display();
        System.out.println(" - Program: " + program);
        System.out.println(" - Year: " + year);
        System.out.println(" - Score: " + score);
        System.out.println(" - Rating: " + getRating());
    }
}
