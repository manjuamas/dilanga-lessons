

public class Student
{
    String dob;
    String firstName;
    String lastName;
    String gender;

    public Student(String dob, String firstName, String lastName, String gender)
    {
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

    }

    public void printStudent(){
        System.out.println("Name is: " + firstName + " "+ lastName);
        System.out.println("Date of birth is: " + dob);

    }
}
