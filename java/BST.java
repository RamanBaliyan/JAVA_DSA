
import java.util.*; 
public class BST {
    
    static class node{
        int data;
        node left;
        node right;
     
        node(int data){
            this.data=data;
        }
    }
        public static node insert(node root,int val){
            if(root==null){
                root = new node(val);
                 return root;
                }
            if(root.data > val){
               root.left= insert(root.left,val);
            }
            else{
                root.right=insert(root.right,val);
            }
            return root;
        }
        public static void inorder(node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data + "");
            inorder(root.right);
            
        }
        public static void search(node root,int element){
            if(root ==null){
                return;
            }
            if(element<root.data){
                search(root.left,element);
                
                }
                else if(root.data==element){
                    System.out.println("element is found in the tree");
                   }
                    
                    else{
                        search(root.right,element);
                    }
          
        }
        public static node delete(node root,int val){
            if(root.data>val){
                root.left=delete(root.left,val);
            }
            else if(root.data<val){
               root.right =  delete(root.right,val);
            }
            else{
                if(root.left==null&&root.right==null){
                    return null;
                }
                 if(root.left==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }
                node is= inorderSuccesor(root.right);
                root.data = is.data;
                root.right = delete(root.right,is.data);
                
            }
            return root;
        }
            public static node inorderSuccesor(node root){
                while(root.left!=null){
                    root=root.left;
                    
                }
                return root;

            }
            public static void range(node root,int x,int y){
                if(root==null){
                    return;
                }
                if(root.data>=x && root.data<=y){
                    range(root.left,x,y);
                    System.out.println(root.data + "");
                range(root.right,x,y);              
             }
             else if(root.data>=y){
                range(root.left,x,y);
            
             }
             else {
                range(root.right,x,y);
             }
            }
            public static void PrintPath(ArrayList<Integer>p){
                for(int i=0;i<p.size();i++){
                    System.out.print(p.get(i)+ "=>");
                }
                System.out.println();
            }
            public static void path(node root,ArrayList<Integer> p){
                if(root==null){
                    return;
                }
                p.add(root.data);

                //leaf
                if(root.left==null&&root.right==null){
                    PrintPath(p);
                }
                else {

                
                path(root.left,p);
                path(root.right,p);
                
                }
                p.remove(p.size()-1);
            }

        
        
        
    
    public static void main(String[] args) {
      int values[]={5,1,3,4,2,7};
      node root=null;
      for(int i=0;i<values.length;i++){
        root = insert(root,values[i]);
      }
      inorder(root);
      System.out.println();
      // search(root,9);
      // delete(root,4);
      // inorder(root);
      System.out.println();
     // range(root,2,12);
      path(root,new ArrayList<>());
    }
}
     

