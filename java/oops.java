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
    pen(pen a2){
        this.a=a2.a;
        this.b=a2.b;

    }
    pen(){}
}
public class oops{

    public static void main(String[] args) {
     pen a1=new pen();

     a1.a=20;
     a1.b=40;
     pen a2=new pen(a1);
     a2.printcolor();
     a2.sum();



        
    }
}
