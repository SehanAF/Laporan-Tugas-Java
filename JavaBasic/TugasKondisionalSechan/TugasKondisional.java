package JavaBasic.TugasKondisionalSechan;

import java.util.Scanner;

public class TugasKondisional {   
    /*
        Nama: M. Sechan Alfarisi
        Nim: 20230040094
        Kelas: TI23A
    */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukan nama anda ");
        String name = in.nextLine();

        System.out.println("Masukan umur anda ");
        int age = in.nextInt();

        in.nextLine();

        System.out.println("Masukan tempat tinggal ");
        String place = in.nextLine();

        System.out.println("Masukan nilai tabungan dalam $ ");
        double money = in.nextDouble();

        String rank = "";

        in.close();
        
        if ((age >= 40) && (place.equals("Nevada")) || (place.equals("New York")) || (place.equals("Havana")) && (money > 10_000_000)) {
            rank = "Don";
        } else if ((age >= 25 && age <= 40) && (place.equals("New Jersey")) || (place.equals("Manhattan")) || (place.equals("Nevada")) && (money >= 1_000_000 && money <= 2_000_000)) {
            rank = "Underboss";
        } else if ((age >= 18 && age <= 24) && (place.equals("California")) || (place.equals("Detroit")) || (place.equals("Boston")) && (money < 1_000_000)) {
            rank = "Capo";
        }

        if (!rank.isEmpty()) {
            System.out.println(name + " kemungkinan adalah seorang anggota mafia dengan " + rank + ".");
        } else {
            System.out.println(name + " tidak mencurigakan.");
        }       
        
    }
}
