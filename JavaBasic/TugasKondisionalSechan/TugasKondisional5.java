package JavaBasic.TugasKondisionalSechan;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TugasKondisional5 {
    /*
        Nama: M. Sechan Alfarisi
        Nim: 20230040094
        Kelas: TI23A
    */

    public static void main(String[] args) {
        
        System.out.println("Selamat datang di Disney Island!");

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur anda ");
        int age = input.nextInt();

        int tarif = 0;

        if (age < 1) {
            System.out.println("Maaf, anda dilarang masuk karena masih bayi");
        } else if (age <= 3) {
            tarif = 30_000;
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Tarif kamu Rp. " + decimalFormat.format(tarif));
            System.out.println("Masukkan tinggi anda ");
            int tinggi = input.nextInt();
            if ((age >= 2 && age <= 3) && (tinggi >= 70)) {
                tarif += 10_000;
                System.out.println("Tarif bertambah menjadi Rp. " + decimalFormat.format(tarif));
            } else {
                System.out.println("Tarif kamu tetap Rp. " + decimalFormat.format(tarif));
            }

        } else if (age <= 7){
            tarif = 40_000;
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Tarif kamu Rp. " + decimalFormat.format(tarif));
            System.out.println("Masukan tinggi anda ");
            int tinggi = input.nextInt();
            if ((age >= 4 && age <= 7 ) && (tinggi >= 120)) {
                tarif += 15_000;
                System.out.println("Tarif bertambah menjadi Rp. " + decimalFormat.format(tarif));
            } else {
                System.out.println("Tarif kamu tetap Rp. " + decimalFormat.format(tarif));
            }

        } else if (age <= 10) {
            tarif = 50_000;
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Tarif kamu Rp. " + decimalFormat.format(tarif));
            System.out.println("Masukan tinggi anda ");
            int tinggi = input.nextInt();
            if ((age >= 8 && age <= 10 ) && (tinggi >= 150)) {
                tarif += 20_000;
                System.out.println("Tarif bertambah menjadi Rp. " + decimalFormat.format(tarif));
            } else {
                System.out.println("Tarif kamu tetap Rp. " + decimalFormat.format(tarif));
            }

        } else {
            tarif = 80_000;
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Tarif kamu Rp. " + decimalFormat.format(tarif));
        }
        
        input.close();
    }
}
