

public class Student
{
    String dob;
    String firstName;
    String lastName;
    String gender;

    String code = "Advanced";

    public Student()
    {

    }
    public Student(String dob, String firstName, String lastName, String gender)
    {
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

    }
    public Student(String dob, String firstName, String lastName, String gender, String code)
    {
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.code =code;

    }

    public void printStudent(){
        System.out.print("Full name is: " + firstName + " "+ lastName);
        System.out.println(" was born on: " + dob);
        System.out.println("This student is of code: " + code);

    }
}
