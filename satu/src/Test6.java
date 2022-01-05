import java.util.Scanner;
public class Test6 {
    
    public static void main(String[] args) {
 
     
     Scanner scanner = new Scanner(System.in);
    int ti = scanner.nextInt();

    if((ti>=8 && ti<=12) || (ti>=14 && ti<= 17) ){
        System.out.println("Jam BELAJAR");
    }else if((ti>=1 && ti<=7)|| (ti==13) || (ti>=18 && ti<= 24) ){
        System.out.println("Jam ISTIRAHAT");
    }else{
        System.out.println("WAKTU HANYA 24 JAM");
    }

    }
}
