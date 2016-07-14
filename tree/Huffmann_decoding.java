/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

Node decode_huff(Node root,char a)
{   
    if(a == '0'){
          return root.left;
       }
    
      return root.right;
    
}
void decode(String S ,Node root)
    {
    Node p = root;
    for(int i=0;i<S.length();i++){
        char c = S.charAt(i);
      p =  decode_huff(p,c);
        if(p.data != '\0'){
           System.out.print(p.data);
            p =root;
        }
    }   
       
    }
