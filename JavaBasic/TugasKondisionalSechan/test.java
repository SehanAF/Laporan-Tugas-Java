package JavaBasic.TugasKondisionalSechan;

import java.util.Scanner;

public class test {   
    /*
        Nama: M. Sechan Alfarisi
        Nim: 20230040094
        Kelas: TI23A
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama anda ");
        String nama = input.nextLine();

        System.out.println("Masukan umur anda ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Masukan tempat tinggal ");
        String tempat = input.nextLine();

        System.out.println("Masukan nilai tabungan dalam $ ");
        double money = input.nextDouble();

        String peringkat = "";

        input.close();
        
        if ((age >= 40) && (tempat.equals("Nevada")) || (tempat.equals("New York")) || (tempat.equals("Havana")) && (money > 10_000_000)) {
            peringkat = "Don";
        } else if ((age >= 25 && age <= 40) && (tempat.equals("New Jersey")) || (tempat.equals("Manhattan")) || (tempat.equals("Nevada")) && (money >= 1_000_000 && money <= 2_000_000)) {
            peringkat = "Underboss";
        } else if ((age >= 18 && age <= 24) && (tempat.equals("California")) || (tempat.equals("Detroit")) || (tempat.equals("Boston")) && (money < 1_000_000)) {
            peringkat = "Capo";
        }

        if (!peringkat.isEmpty()) {
            System.out.println(nama + " kemungkinan adalah seorang anggota mafia dengan " + peringkat + ".");
        } else {
            System.out.println(nama + " tidak mencurigakan.");
        }       
        
    }
}

