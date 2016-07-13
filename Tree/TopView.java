/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
   if(root != null) {
       print_left(root.left);
       System.out.print(root.data+" ");
       print_r(root.right);
   }
}
void print_left(Node left){
    if(left !=null) {
         print_left(left.left);
        System.out.print(left.data+" ");
       
    }
}
void print_r(Node r){
    if(r !=null) {
        System.out.print(r.data+" ");
        print_r(r.right);
    }
}
