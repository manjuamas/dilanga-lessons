import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PersonalityMatcher
{
    public static void main(String[] args)
    {
        Student student1=new Student("25/08/1998", "Dilanga", "Jayawardena", "M");
        //student1.printStudent();

        Student student2= new Student("24/08/1988", "Manjula", "Ama", "F");
        //student2.printStudent();

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        for (Student s: studentList)
        {
            s.printStudent();
            System.out.println("---------------------");
        }
    }
}
