package JavaBasic.Tugas4LoopingSechan;

import java.util.Scanner;

public class Tugas1Sechan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println(("Masukan kata: "));
        String kata = input.nextLine();

        String pembalikanKata = "";

        for (int i = 0; i < kata.length(); i++) {
            pembalikanKata = kata.charAt(i) + pembalikanKata;
        }

         // Stuck
        if ( ){
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }

        System.out.println("Reversed kata: " + pembalikanKata);

        input.close();

    }
}
