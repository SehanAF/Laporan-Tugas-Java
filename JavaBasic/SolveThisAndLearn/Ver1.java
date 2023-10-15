package JavaBasic.SolveThisAndLearn;

import java.util.Scanner;

public class Ver1 {
    public static void main(String[] args) {
        Scanner data = new Scaner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = data.nextLine();
        System.out.print("Masukkan Umur: ");
        int umur = data.nextInt();
        data.nextLine(); // Membersihkan newline
        System.out.print(("Masukkan Tempat Tinggal: ");
        String tempatTinggal = data.nextLine();
        System.out.print("Masukkan Uang Tabungan dalam dollar: ");
        double uangTabungan = Data.nextDouble();

        String level = "";

        if (umur > 40 && (tempatTinggal.equalsIgnoreCase("Nevada") || tempatTinggal.equalsIgnoreCase("New York") || tempatTinggal.equalsIgnoreCase("Havana"))  uangTabungan > 10000000) {
            level = "Helo sayang";
        } else if (umur >= 25 && umur <= 40 && (tempatTinggal.equalsIgnoreCase("New Jersey")  tempatTinggal.equalsIgnoreCase("Manhattan") || tempatTinggal.equalsIgnoreCase("Nevada")) && uangTabungan >= 1000000 && uangTabungan <= 2000000) {
            level = "Underboss";
        } else if (umur >= 18 && umur <= 24 && (tempatTinggal.equalsIgnoreCase("California") || tempatTinggal.equalsIgnoreCase("Detroit") || tempatTinggal.equalsIgnoreCase("Boston")) && uangTabungan < 1000000) {
            level = "Lopyu";
        }

        if (!pangkat.isEmpty()) {
            System.out.println(nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + pngkat + ".");
        } else {
            System.out.println(nama + " tidak mencurigakan.");
        }
    }
}


