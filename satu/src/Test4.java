import java.util.Scanner;
import java.util.jar.Attributes.Name;
public class Test4 {
    public static void main(String[] args)  {
        
        Scanner scanner1 = new Scanner(System.in);
     
       Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Isi nama");
        String nama=scanner1.nextLine();
        System.out.println("Isi peran (Superhero atau Monster)");
        String peran= scanner2.nextLine();

        String a= "Superhero";
        String b= "Monster";
        

        if(nama==""&& peran==""){
            System.out.println("Nama dan peran harus diisi");
        }else if(nama==""){
            System.out.println("Nama harus diisi");
        }else if(peran.equals(a)){
            System.out.println("Selamat Datang Superhero "+nama+", Kalahkan Semua Monster Di Muka Bumi");
        }else if(peran.equals(b)){
            System.out.println("Selamat Datang Monster "+nama+", Hancurkan Semua Superhero Yang Ada");
        }else {
            System.out.println("Selamat Datang "+nama+" Pilih Peranmu Untuk Melanjutkan Game Ini");
        }

        

        //System.out.println(nama);
        //System.out.println(peran);
    }
}