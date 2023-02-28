class bank{
    public String name;
    private String pass;
    protected int no;
    public void getpassword(){
    System.out.println(this.pass);
    }
    public void setpassword(String pass){
        this.pass=pass;
    }
}
public class oopsAccesModifers {
    public static void main(String[] args) {
        bank b1= new bank();
        b1.name = "Raman baliyan ";
        
        b1.no=50;
        b1.setpassword("Raman");
        b1.getpassword();
    }
    
}
