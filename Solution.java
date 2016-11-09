/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
        for( int i=0 ; i<S.length(); i++){
            Node temp = root ;
            while( true ){
                if( temp.left==null && temp.right==null ){
                    System.out.print(temp.data);
                    i--;
                    break ;
                }
                //i++;
                int num = Integer.parseInt(S.substring(i,i+1));
                if( num==0 ){
                    temp = temp.left ;   
                }
                else if( num==1 ){
                    temp = temp.right ;   
                }
                i++;
            }
        }

       
    }
