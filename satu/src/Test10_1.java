import java.util.Scanner;
public class Test10_1 {
    
    public static void main(String[] args) {
 
     
     Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    
    String bintang="";
    int i=0;
    
        while(i<num){
            bintang+="*";
            System.out.println(bintang);
            i++;

           
        }
        //System.out.println(i);
        for(int j=i;j>1;j--){
            bintang = bintang.substring(0, bintang.length() - 1);
            System.out.println(bintang);
        }
        
    }
}
