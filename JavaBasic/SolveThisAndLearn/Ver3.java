package JavaBasic.SolveThisAndLearn;

import java.util.Scanner;

public class Ver3 {

    public static void main(String[] args) {
        
        Scanner Data = new Scanner(System.in); 

        System.out.println("Masukan nomor punggung anda ");
        int nomorPungung = data.nextInt();

        if ( nomorPunggung % 2 == 0){
            if (nomorPunggung >= 50 && nomorPunggung <= 100){
                System.out.println("Posisi anda adalah Attacker dan kamu cocok menjadi apa yah?.");
            } else {
                System.out.println("Posisi kamu adalah Attacker.");
                    
        } else if (nomorPunggung % 2 == 1) {
            System.out.printn("Posisi maneh adalah Defender.");
            if (nomorPunggung >= 90){
                System.out.println("Posisi you adalah Playmaker.");
            } else if (nomorPunggung >= 3 && nomorPunggung < 6){
                System.out.println("Posisi sia adalah Kiper.");
                } 
        } else {
            System.out.println("Tolong masukan angka yang benar dong.");
            } 
        input.close(); 
    }
}
    