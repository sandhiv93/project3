public class student
{
    // Instance Variables
    String name;
    String course;
    int age;

    // Constructor Declaration of Class
    public student(String name, String course,int age)
    {
        this.name = name;
        this.course = course;
        this.age = age;
    }

    // method 1
    public String getName()
    {
        return name;
    }


    public static void main(String[] args)
    {
        // creating object using new operator
        student s1 = new student("Ravi","CSE",23);

        System.out.println(s1.getName());
    }
}