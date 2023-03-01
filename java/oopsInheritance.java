class shape{
    String color;
    int i;
    public void area(){

    
    System.out.println("Display area");
    }
}
class triangle extends shape{
    public void print(){
        System.out.println(color);
    }

    
}
class isolateral extends triangle{
    public void print(){
        System.out.println(i+color);
    }

    
}
public class oopsInheritance {
    public static void main(String[] args) {
        triangle t1= new triangle();
        isolateral i1=new isolateral();
        i1.i=56;
        i1.color="black";
        t1.color="Red";
        i1.print();
        t1.print();
    }
    
}
