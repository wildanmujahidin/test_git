import  java.util.Scanner;
public class Test2 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int amount= scanner.nextInt();
        float phi;

        phi=3.14F;

        float res = phi*amount*amount;
        //System.out.println(phi);
        System.out.println(res);

    }
}
