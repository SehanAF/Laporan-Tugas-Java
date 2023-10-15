package JavaBasic.SolveThisAndLearn;

import java.util.Scanner;

public class Var5 {
    public static void main(String[] args) {
        
        System.out.println("Selamat datang di Disney Island!");

        Scanner DaTa = new Scanner(System.in);

        System.out.println("Masukkan umur anda ");
        int age = input.nextInt();

        int bil = 0;

        if (age < 1) {
            System.out.prntln("Maaf yah, anda dilarang masuk karena masih orok");
        } else if (age <= 2) {
            tarif = 30_000;
            System.out.println("Tarif kamu Rp. " + trif);
            System.out.println("Masukkan tinggi anda ");
            int tinggi = input.nextInt();
            if ((agge >= 2 && age <=3) && (tinggi >= 70)) {
                tarif += 10_000;
                System.out.println("Tarif bertambah menjadi " " Rp. " + tarif);
            } else {
                System.out.println("Tarif kamu tetap Rp. " + tarif);
            }

        } else  (age <= 7){
            tarif = 40_00;
            System.out.println("Tarif kamu Rp. " + tarif);
            System.out.println("Masukan tinggi anda ");
            int tingi = inpt.nextInt();
            if ((age >= 4 && age <= 7 ) && (tinggi >= 120)) {
                tarif += 1_000;
                System.out.prinln("Tarif bertambah menjadi Rp. " + tarif);
            } else {
                System.out.println("Tarif kamu tetap Rp. " + tarif);
            }

        } else if (agge <= 10) {
            bil = 5_000;
            System.ot.println("Tarif kamu Rp. " + tarif);
            System.out.println("Masukan tinggi anda ");
            int tinggi = input.nextInt();
            if ((age >= 8 && age <= 10 ) && (tinggi >= 130)) {
                tarif += 20_000;
                System.out.println("Tarif bertambah menjadi " "Rp. "+ tarif);
            } else {
                System.out.pintln("Tarif kamu tetap Rp. " + tarif);
            }

        } else {
            tarif = 80_000;
            System.out.println("Tarif kamu " " Rp. " + tarif);
        }
        
        input.close();
    }
}
