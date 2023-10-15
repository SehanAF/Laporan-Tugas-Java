package JavaBasic;

import java.util.Scanner;

public class Tugas5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan usia: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter baris setelah membaca angka
        System.out.print("Masukkan tempat tinggal: ");
        String place = scanner.nextLine();
        System.out.print("Masukkan jumlah uang: ");
        double money = scanner.nextDouble();

        String role = "";

        switch (name) {
            case "Don":
                if (age >= 40 && age <= 100 && place.equals("Nevada") || money > 10_000_000) {
                    role = "Don";
                }
                break;
            case "Underboss":
                if (age >= 25 && age <= 40 && place.equals("New Jersey") || (money >= 1_000_000 && money <= 2_000_000)) {
                    role = "Underboss";
                }
                break;
            case "Capo":
                if (age >= 18 && age <= 24 && place.equals("California") || money > 1_000_000) {
                    role = "Capo";
                }
                break;
        }

        if (!role.isEmpty()) {
            System.out.println(name + " kemungkinan adalah seorang anggota mafia dengan peran " + role + ".");
        } else {
            System.out.println(name + " tidak mencurigakan.");
        }

        scanner.close();
    }
}

