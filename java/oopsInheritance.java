import javax.sound.sampled.SourceDataLine;

class shape{
    String color;
    public void area(){

    
    System.out.println("Display area");
    }
}
class triangle extends shape{
    public void print(){
        System.out.println(color);
    }

    
}
public class oopsInheritance {
    public static void main(String[] args) {
        triangle t1= new triangle();
        t1.color="Red";
        t1.print();
    }
    
}
