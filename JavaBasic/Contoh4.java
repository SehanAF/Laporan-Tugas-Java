package JavaBasic;

import java.util.Scanner;

public class Contoh4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input bilangan 1: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Input bilangan 2: ");
        double bilangan2 = input.nextDouble();

        System.out.print("Input Operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        double hasil = switch (operator) {
            case '+' -> bilangan1 + bilangan2;
            case '-' -> bilangan1 - bilangan2;
            case '*' -> bilangan1 * bilangan2;
            case '/' -> {
                if (bilangan2 != 0) {
                    yield bilangan1 / bilangan2;
                } else {
                    System.out.println("Pembagian oleh nol tidak diizinkan.");
                    yield 0;
                }
            }
            case '%' -> {
                if (bilangan2 != 0) {
                    yield bilangan1 % bilangan2;
                } else {
                    System.out.println("Modulus oleh nol tidak diizinkan.");
                    yield 0;
                }
            }
            default -> {
                System.out.println("Operator tidak valid.");
                yield 0;
            }
        };

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            System.out.println("Hasil " + (operator == '/' ? "pembagian" : "perhitungan") + " " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
        }

        input.close();
    }
}


