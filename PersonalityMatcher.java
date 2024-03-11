import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PersonalityMatcher
{
    public static void main(String[] args)
    {
        Student student1=new Student("25/08/2009", "Dilanga", "J", "M", "Intermediate");
        //student1.printStudent();

        Student student2= new Student("24/10/2015", "Manjula", "A", "F");
        //student2.printStudent();

        Student student3 = new Student("25/04/1985", "Sara", "B" , "F");

        Student student4 =new Student();
        student4.firstName="Mark";
        student4.lastName="Doe";
        student4.dob="04/05/2026";
       // student4.gender = "a";

        Student student5 =new Student();
        student5.firstName="Mervin";
        student5.lastName="Doesi";
        student5.dob="04/05/2026";
        // student4.gender = "a";

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        for (Student s: studentList)
        {
            s.printStudentDetails();
        }
    }
}
