package JavaBasic;

import java.util.Scanner;

public class Contoh3 {
    
    public static void main(String[]args) {
       int angka1;
       int angka2;
       int hasil;
       
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Masukan Angka Pertama : ");
       angka1 = keyboard.nextInt();
       System.out.print(" Masukan Angka Kedua : ");
       angka2 = keyboard.nextInt();
       

       //Penjumlahan
       System.out.println("===Penjumlahan===");
       hasil = angka1 + angka2;
       System.out.println("Hasil Dari Penjumlahan = " + hasil);
       System.out.println("===================");
       
       System.out.print("Masukan Angka Pertama : ");
       angka1 = keyboard.nextInt();
       System.out.print("Masukan Angka Kedua : ");
       angka2 = keyboard.nextInt();
       //Pengurangan
       System.out.println("===Pengurangan===");
       hasil = angka1 - angka2;
       System.out.println("Hasil Dari Pengurangan = " + hasil);
       System.out.println("===================");
       
       System.out.print("Masukan Angka Pertama : ");
       angka1 = keyboard.nextInt();
       System.out.print("Masukan Angka Kedua : ");
       angka2 = keyboard.nextInt();
       //Perkalian
       System.out.println("===Perkalian===");
       hasil = angka1 * angka2;
       System.out.println("Hasil Dari Perkalian = " + hasil);
       System.out.println("===================");
       
       System.out.print("Masukan Angka Pertama : ");
       angka1 = keyboard.nextInt();
       System.out.print("Masukan Angka Kedua : ");
       angka2 = keyboard.nextInt();
       //Pembagian
       System.out.println("===Pembagian===");
       hasil = angka1 / angka2;
       System.out.println("Hasil Dari Pembagian = " + hasil);
       System.out.println("===================");
       
       System.out.print("Masukan Angka Pertama : ");
       angka1 = keyboard.nextInt();
       System.out.print("Masukan Angka Kedua : ");
       angka2 = keyboard.nextInt();
       //Modulus
       System.out.println("===Modulus===");
       hasil = angka1 % angka2;
       System.out.println("Hasil Dari Modulus = " + hasil);

       keyboard.close();
    }
}


