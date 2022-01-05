import java.util.Scanner;
public class Test7 {
    
    public static void main(String[] args) {
 
     
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
       int tanggal = scanner1.nextInt();
       int bulan = scanner2.nextInt();
       int tahun = scanner3.nextInt();
        
       String bulanName ="";

       
       switch (bulan) {
           case 1: bulanName="Januari";
               
               break;
           case 2: bulanName="Februari";
           
           break;
           case 3: bulanName="Maret";
           
           break;
           case 4: bulanName="April";
           
           break;
           case 5: bulanName="Mei";
           
           break;
           case 6: bulanName="Juni";
           
           break;
           case 7: bulanName="Juli";
           
           break;
               case 8: bulanName="Agustus";
               
               break;
               case 9: bulanName="September";
               
               break;
               case 10: bulanName="Oktober";
               
               break;
               case 11: bulanName="November";
               
               break;
               case 12: bulanName="Desember";
               
               break;
               
           default: bulanName="Input bulan salah";
               break;
       }
       System.out.println(tanggal+" "+bulanName+" "+tahun);
   
       }
}
