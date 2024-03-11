

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
        this.code = code;

    }

    public void printStudentDetails()
    {
        System.out.print("Full name is: " + firstName + " " + lastName);
        System.out.println(" was born on: " + dob);
        System.out.println("This student is of code: " + code);
        System.out.println(revealGender());
        System.out.println();
    }

    public String revealGender()
    {
        if (gender==null || gender.equals(""))
        {
            return "This student's gender is unkonwn";
        }
        if (gender.equals("M"))
        {
            return "This is a Male";
        }
        if (gender.equals("F"))
        {
            return "This is a Female";
        }
        else
        {
            return "This student's gender is given but does not match";
        }
    }
}
