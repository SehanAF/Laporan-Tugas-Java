package JavaBasic;

import java.util.Scanner;

public class Contoh {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Bilangan 1: ");
        double bilangan1 = scanner.nextDouble();  // Menggunakan tipe data double
        
        System.out.print("Masukan Bilangan 2: ");
        double bilangan2 = scanner.nextDouble();  // Menggunakan tipe data double
        
        System.out.print("Masukan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double hasil = 0.0;  // Menggunakan tipe data double untuk hasil
        
        scanner.close();

        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                break;
            case '/':
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Tidak dapat melakukan pembagian dengan nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }
        
        System.out.println("Total setelah Pembagian adalah: " + hasil);
    }
}


