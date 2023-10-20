package JavaBasic.Tugas4LoopingSechan;

import java.util.Scanner;

public class Tugas1Sechan {
    public static void main(String[] args) {
        
        String word, wordReversal = "";

        Scanner input = new Scanner(System.in);

        System.out.println(("Masukan kata: "));
        word = input.nextLine();

        int length = word.length();

        for ( int i = (length - 1); i >= 0; i--) {
            wordReversal += word.charAt(i);
        }

        if (word.toLowerCase().equals(wordReversal.toLowerCase()))  {
            System.out.println(word + " adalah Palindrome.");  
        }else{  
            System.out.println(word + " bukan Palindrome.");   
        }

        System.out.println("Reversed kata: " + wordReversal);

        input.close();

    }
}
