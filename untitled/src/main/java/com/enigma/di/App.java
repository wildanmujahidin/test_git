package com.enigma.di;

public class App {

    static String address = "Jakarta";
    String alamat = "Bogpr";

    //static hanya bisa memanggil static (jarang dipake)
    public static void main(String[] args) {

        String naem = "Rrifqi Ramadhan";
        String fullName = "M Rifqi Ramadhan";
        Integer umur =24;
        int umur2 =25;

        //memanggil variable static di method static
        System.out.println(address);

        //memanggil variable non static di method static harus dibuat instance object baru (contoh class App)
        App app = new App();
        System.out.println(app.alamat);
        System.out.println(app.sum(5,5));
        app.printName("Yoshua");

        int[] numbers = new int[5];
        numbers[0] =5;
        numbers[1] =4;
        numbers[2] =3;
        numbers[3] =2;
        numbers[4] =1;

        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //Cara lain buat Array di Java
        String[] names = {"Rifqi", "Ramadhan"};

        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }

    }

    public Integer sum(Integer angka1, Integer angka2){
        int result = angka1+angka2;
        return  result;
    }
    public void printName(String name){
        System.out.println(name);
    }
}
