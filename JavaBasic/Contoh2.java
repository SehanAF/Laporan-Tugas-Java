package JavaBasic;

import java.util.Scanner;

public class Contoh2 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input bilangan 1: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Input bilangan 2: ");
        double bilangan2 = input.nextDouble();

        System.out.print("Input Operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                System.out.println("Hasil penjumlahan " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                System.out.println("Hasil pengurangan " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                    System.out.println("Hasil pembagian " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                } else {
                    System.out.println("Pembagian oleh nol tidak diizinkan.");
                }
                break;
            case '%':
                if (bilangan2 != 0) {
                    hasil = bilangan1 % bilangan2;
                    System.out.println("Hasil modulus " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                } else {
                    System.out.println("Modulus oleh nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
        }

        input.close();
    }
}


