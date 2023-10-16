package JavaBasic.Tugas4LoopingSechan;

import java.util.Scanner;

public class Tugas1Sechan {
    public static void main(String[] args) {
        
        String kata, pembalikanKata = "";

        Scanner in = new Scanner(System.in);

        System.out.println(("Masukan kata: "));
        kata = in.nextLine();

        int panjang = kata.length();

        for ( int i = (panjang - 1); i >= 0; i--) {
            pembalikanKata += kata.charAt(i);
        }

        if (kata.toLowerCase().equals(pembalikanKata.toLowerCase()))  {
            System.out.println(kata + " adalah Palindrome.");  
        }else{  
            System.out.println(kata + " bukan Palindrome.");   
        }

        /* *Stuck logic
        if ( kata == pembalikanKata ) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
        */

        /* 
        Boolean convertStr = Boolean.valueOf(pembalikanKata);
        if (convertStr == true) {
           System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
        */

        System.out.println("Reversed kata: " + pembalikanKata);

        in.close();

    }
}
