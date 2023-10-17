package JavaBasic.TugasKondisionalSechan;

import java.util.Scanner;

public class TugasKondisional3 {
    /*
        Nama: M. Sechan Alfarisi
        Nim: 20230040094
        Kelas: TI23A
    */
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 

        System.out.println("Masukan nomor punggung anda ");
        int nomorPunggung = in.nextInt();

        if ( nomorPunggung % 2 == 0){
            if (nomorPunggung >= 50 && nomorPunggung <= 100){
                System.out.println("Posisi kamu adalah Attacker dan kamu cocok menjadi Kapten Tim.");
            } else {
                System.out.println("Posisi kamu adalah Attacker.");
                }    
        } else if (nomorPunggung % 2 == 1) {
            System.out.println("Posisi kamu adalah Defender.");
            if (nomorPunggung >= 90){
                System.out.println("Posisi kamu adalah Playmaker.");
            } else if (nomorPunggung >= 3 && nomorPunggung < 6){
                System.out.println("Posisi kamu adalah Kiper.");
                } 
        } else {
            System.out.println("Tolong masukan angka yang valid.");
            } 
        in.close(); 
    }
}
