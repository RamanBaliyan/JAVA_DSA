import java.util.*;
class pen{
    int a,b,c;

    public void sum()
    {
c=a+b;
System.out.println(c);
    }
    public void printcolor()
    {
        System.out.println(this.a);
    }
}
public class oops{

    public static void main(String[] args) {
     pen a1=new pen();
     a1.a=20;
     a1.b=40;
     a1.printcolor();
     a1.sum();



        
    }
}
