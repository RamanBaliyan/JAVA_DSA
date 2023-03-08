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
        
        
    
    public static void main(String[] args) {
      int values[]={5,1,3,4,2,7};
      node root=null;
      for(int i=0;i<values.length;i++){
        root = insert(root,values[i]);
      }
      inorder(root);
      System.out.println();
      search(root,9);
    }
}
    

