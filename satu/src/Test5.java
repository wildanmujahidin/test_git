import java.util.Scanner;
public class Test5 {
    
    public static void main(String[] args) {
 
     
     Scanner scanner = new Scanner(System.in);
    int ti = scanner.nextInt();

    if(ti>=8 && ti<=17){
        System.out.println("Success");
    }else if((ti>=0 && ti<=7) || (ti>=18 && ti<= 23) ){
        System.out.println("Failed");
    }else{
        System.out.println("Wrong time");
    }

    //for(int i=0; i<=23;i++){
      //  if(){
    //}
    // System.out.println(ti);
    }
}
