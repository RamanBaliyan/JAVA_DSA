class student{
    String name;
    int age;
    public void printInfo(String name,int age)
    {
        System.out.println(name + " age is " + age);
    
    }
    public void printInfo(int age)
    {
        System.out.println(age );
    }
}
public class oops_2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.age=20;
        s1.name="Raman baliyan";
        s1.printInfo(s1.name,s1.age);
    }
    
}
