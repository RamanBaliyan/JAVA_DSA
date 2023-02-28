abstract class animal{
    abstract void walk();
    public void eats(){
        System.out.println("food eat");
    }
    animal(){
        System.out.println("new animal is creating");
    }
}
class horse extends animal{
    public void walk(){
        System.out.println("Walk on four legs");

    }
    horse(){
        System.out.println("a horse is created");
    }

}
class chicken extends animal{
    public void walk(){
        System.out.println("Walk on two legs");

    }

}
public class oopsAbstract {
    public static void main(String[] args) {
        horse h1= new horse();
    //     h1.walk();
        chicken c1=new chicken();
     //   c1.walk();
       // h1.eats();
        //c1.eats();
    }
    
}
