package JavaBasic.src_uts;

import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        
        final int batasPengeluaran = 1_000_000;
        int totalPengeluaran = 0;
        Scanner input = new Scanner(System.in);

        for (int hari = 1; hari <= 7; hari++) {
            System.out.print("Masukkan pengeluaran untuk hari ke " + hari + ":" );
            int pengeluaranHarian = input.nextInt();
            totalPengeluaran += pengeluaranHarian;
        }
        input.close();

        String hasil = (totalPengeluaran > batasPengeluaran) ? "melebihi" : "dalam";
        System.out.println("Total pengeluaran anda adalah " + totalPengeluaran);
        System.out.println("Pengeluaran anda adalah " + hasil + " batas minggu");
        


    }
}
