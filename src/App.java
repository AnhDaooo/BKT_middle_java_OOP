import Person.Person;
import Student.Student;
import Staff.Staff;

public class App {
    public static void main(String[] args){
        //Person.create
        System.out.println("The person: ");
        Person p = new Person("John", "America");
        p.display();
        System.out.println();

        //Student.create
        System.out.println("The student: ");
        Student st = new Student();
        st.setName("Marry");
        st.setAddress("America");
        st.setProgram("the first program");
        st.setYear(2023);
        st.setScore(9.5);
        st.display();
        System.out.println();

        //Staff.create
        System.out.println("The staff: ");
        Staff stf = new Staff();
        stf.setName("Saka X");
        stf.setAddress("Japan");
        stf.setSchool("Tokyo University");
        stf.setSalary(300000);
        stf.display();
        System.out.println();
    }
}
