import java.util.ArrayList;
import java.util.Collections;
public class DsaArrayList {
    public static void main(String[] args) {
      ArrayList<Integer> list1=new ArrayList<Integer>();
      list1.add(0);
      list1.add(3);
      list1.add(5);
      System.out.println(list1);
      int element = list1.get(1);   
      System.out.println(element);
      //to add element inbetween two elements
      list1.add(1,5);
      System.out.println(list1);
      //to change the value of the any index element
      list1.set(1,10);
      System.out.println(list1);
      //to delete the elements from the list we use remove()
      list1.remove(3);
      System.out.println(list1);
      //to find the size of the list
      System.out.println(list1.size());
      //for loop using size function
      for(int i =0;i<list1.size();i++)
      {
        System.out.print(list1.get(i));}
        System.out.println();
        //for sorting we use collection
        Collections.sort(list1);
        System.out.println(list1);
      
    }
    
}
