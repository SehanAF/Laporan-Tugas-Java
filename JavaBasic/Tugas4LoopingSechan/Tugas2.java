package JavaBasic.Tugas4LoopingSechan;
//import java.util.Scanner;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println(("Masukan angka: "));
        int inputNumbers = input.nextInt();
    
        int nextPalindrome = findNextPalindrome(inputNumbers);
        System.out.println("Angka palindrome terdekat selanjutnya dari " + inputNumbers + " adalah " + nextPalindrome);

        input.close();
    }
    

    public static int findNextPalindrome(int inputNumbers) {
        while (true) {
            inputNumbers++;
            if (isPalindrome(inputNumbers)) {
                return inputNumbers;
            }
        }
    }

    public static boolean isPalindrome(int numberToCheck) {
        int reversed = 0;
        int original = numberToCheck;

        while (numberToCheck != 0) {
            int digit = numberToCheck % 10;
            reversed = reversed * 10 + digit;
            numberToCheck /= 10;
        }

        return original == reversed;
        
    }
    
}


