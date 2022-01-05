import java.util.Scanner;
public class Test3 {
    public static void main(String[] args)  {
        Scanner scanner1 = new Scanner(System.in);
       Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        int p=scanner1.nextInt();
        int l= scanner2.nextInt();
        int t= scanner3.nextInt();
        int vol =p*l*t;
        int lu= 2*(p*l+p*t+l*t);
        //int lu = 2*((scanner1.nextInt()*scanner2.nextInt())+(scanner1.nextInt()*scanner3.nextInt())+(scanner2.nextInt()*scanner3.nextInt()));

        System.out.println(vol);
        System.out.println(lu);
    }
}