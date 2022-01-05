////////
public class Test12 {  
    public static void main(String[] args) {    
      Integer [] numbers = {1,2,3,4,5,6};
      Integer [] anotherNumbers = {4,5,6,7,8,9,10}; 
         /* taruh code disini*/
         //int[] FArr=new int[10];
         for(int t: numbers){
            for(int u:anotherNumbers){
                if(u==t){
                    //FArr[t]=u;
                    
                    System.out.println(u);
                }
            }
         }
    }
  }
  
  
