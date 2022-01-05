import java.util.Scanner;
public class Test10 {
    
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
        bintang="";
        for(int j=i-1;j>0;j--){
            for(int k=j;k>0;k--){
                bintang+="*";
            }
            System.out.println(bintang);
            bintang="";
        }
    }
}
