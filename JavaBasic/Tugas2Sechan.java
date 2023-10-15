package JavaBasic;

import java.util.Scanner;

/* 
  Nama: M. Sechan Alfarisi
  Nim = 20230040094
*/

public class Tugas2Sechan {
    public static void main(String[] args) {
        
        // 1. Tugas Variable

        int nilai = 829;
        String hasil = "";

        if(nilai >= 85 && nilai <= 100){
            hasil = "A";
        }
        else if(nilai>= 75 && nilai <= 84) {
            hasil = "B";
        }
        else if(nilai >= 70 && nilai <= 74){
            hasil = "C";
        }
        else if(nilai >= 50 && nilai <= 69){
            hasil = "D";
        }
        else if(nilai >= 0 && nilai <= 49){
            hasil = "E";
        }
        else{
            hasil = "Input anda salah";
        }

        System.out.println(hasil);


        // Tugas 2 Tipe Data

        Scanner value = new Scanner(System.in);

        System.out.println("Masukan Bilangan ke 1: ");
        double bilangan1 = value.nextDouble();

        System.out.println("Masukan Bilangan ke 2: ");
        double bilangan2 = value.nextDouble();

        System.out.print("Masukan operator (+, -, *, /, %) ");
        char operator = value.next().charAt(0);

        value.close();

        double result;

        switch (operator) 
        {
            case '+' :
            {
                result  = bilangan1 + bilangan2;
                System.out.println("Total setelah Penambahan adalah : " + result);
                break;
            }
            case '-' :
            {           
                result  = bilangan1 - bilangan2;
                System.out.println("Total setelah Pengurangan adalah : " + result);
                break;
            }
            case '*' :
            {
                result  = bilangan1 * bilangan2;
                System.out.println("Total setelah Perkalian adalah : " + result);
                break;
            }
            case '/' :
            {
                result  = bilangan1 / bilangan2;
                System.out.println("Total setelah Pembagian adalah : " + result );
                break;
            }
            case '%' :
            {
                result  = bilangan1 % bilangan2;
                System.out.println("Total setelah Modulus adalah : " + result );
                break;
            }
            default :
            {
                System.out.println("Silakan pilih operator yang tepat");
                return;

            }
        }
    }           
}    