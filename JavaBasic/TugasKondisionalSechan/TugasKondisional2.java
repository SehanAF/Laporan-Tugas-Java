package JavaBasic.TugasKondisionalSechan;

import java.util.Scanner;

public class TugasKondisional2 {
    /*
        Nama: M. Sechan Alfarisi
        Nim: 20230040094
        Kelas: TI23A
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai coding");
        int nilaiCoding = input.nextInt();

        System.out.println("Masukan nilai interview untuk lulus yaitu A/B");
        String nilaiLulus = input.next();

        if (nilaiCoding < 0 || nilaiCoding > 100){
            System.out.println("Maaf, nilai koding harus diantara 0 - 100.");
        } else {
            if (nilaiCoding >= 80){
                System.out.println("Kamu lolos");
            } else if (nilaiCoding >= 60) {
                System.out.println("Kamu dipertimbagkan");
            } else {
                System.out.println("Kamu gagal.");
            }
        }
            
        if (nilaiLulus.equalsIgnoreCase("A") || nilaiLulus.equalsIgnoreCase("B")){
            System.out.println("Lolos tes coding");
        } else {
            System.out.println("Maaf kamu gagal tes Interview");
        }

        if ((nilaiCoding >= 60) && (nilaiLulus.equalsIgnoreCase("A") || nilaiLulus.equalsIgnoreCase("B"))){
            System.out.println("Selamat, kamu berhasil jadi Programmer");
        }else {
            System.out.println("Maaf, kamu belum berhasil menjadi calon Programmer");
        }

        input.close();
    }
}
