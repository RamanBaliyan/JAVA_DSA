class student{
    String name;
    static String school;
}
public class oopsStatic {
    public static void main(String[] args) {
        student.school="Rakhee Public School";
        student s1= new student();
        s1.name = "Raman baliyan";
        System.out.println(s1.name);
        System.out.println(student.school);
    }
    
}
