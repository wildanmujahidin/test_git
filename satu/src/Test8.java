import java.util.Scanner;
public class Test8 {
    
    public static void main(String[] args) {
 
     
     Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    int ganjil=0;
    String ganjilName="ganjil : ";
    int genap=0;
    String genapName="genap : ";

    if(num<0){
        System.out.println("angka harus positif");
    }else{

    for(int i=1;i<num;i++){
        if(i%2!=0){
            ganjil+=i;
            if(i==1){
                ganjilName+=i;
            }else{
            ganjilName+=" + "+i;
            //System.out.println("i "+i);
            }
        }
    }
    for(int l=2;l<=num*2;l++){
       
        if(l%2==0){
            genap+=l;
            if(l==2){
                genapName+=l;
            }else{
                genapName+= " + "+l;
            }
            System.out.println("l "+l);
        }
    }

    System.out.println(ganjilName+" = "+ganjil);
    System.out.println(genapName+" = "+genap);
    }
    }
}
