interface animals{
    public void walk();
    int eye = 2;
    //animal(){} in interface we cannot make the constuctor and also method 
}
interface herbivores{
}
class horse implements animals,herbivores{          //multiple inheritance possible using interface
    public void walk(){
    System.out.println("Horse walk on four legs");
    }

}
public class oopsInterfaceAbstraction {
    public static void main(String[] args) {
      horse h1= new horse ();
      h1.walk();  
    }
    
}
