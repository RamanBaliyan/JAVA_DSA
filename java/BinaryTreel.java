import java.util.*;
public class BinaryTreel {
   static class node{      //node create kiya h😊
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
        static class BinaryTree{
            static int idx = -1;
            public static node buildTree(int nodes[]){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }
                node newnode = new node(nodes[idx]);
                newnode.left=buildTree(nodes);
                newnode.right=buildTree(nodes);
                return newnode;
            }
           
            }
            public static void preOrder(node root){    //preorder ❤️
                if(root==null){
                    return;
                }
                System.out.print(root.data + "");
                preOrder(root.left);
                preOrder(root.right);
            }
        public static void inorder(node root){     //inorder 😘
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + "");
            inorder(root.right);
        }
        public static void postorder(node root){   //postorder 😍
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data +"");
        }
        public static void levelOrder(node root){       //levelOrder💕
            Queue <node> q= new LinkedList<>();
            if (root==null){
                return;
            }
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                node currnode = q.remove();
                if(currnode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else {
                        q.add(null);
                    }

                }
                else{
                    System.out.print(currnode.data + "");
                    if(currnode.left!=null){
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
            }
        }
        public static int Count(node root){ //count
            if(root==null){
                return 0;
            }
            int leftnodes= Count(root.left);
            int rightnodes = Count(root.right);
            return leftnodes+rightnodes+1;
        }
        public static int Sum(node root){ //count
            if(root==null){
                return 0;
            }
            int leftnodes= Sum(root.left);
            int rightnodes = Sum(root.right);
            return leftnodes+rightnodes+root.data;
        }
        public static int height(node root){
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left);
            int rightHeight= height(root.right);
            int h = Math.max(leftHeight , rightHeight) + 1;
            return h;
        }
        public class diam{
                int ht;
                int diam;
            diam(int ht, int diam){
                this.ht=ht;
                this.diam=diam;
            }
        }
         
        
    
    
    public static void main(String[] args) {
        int nodes[]={1,2,3,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree b=new BinaryTree();
         node root = b.buildTree(nodes);
        inorder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println(Count(root));
        System.out.println(Sum(root));
        System.out.println(height(root) + "height");
    }
} 

