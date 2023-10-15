package JavaBasic;

import java.util.Scanner;

public class Contoh5 {
    public static void main(String[] args) {
        Scanner Data = new Scanner(System.in);

        System.out.println("Masukan angka 1: ");
        double bilangan = Data.nextDouble();

        System.out.println("Masukan angka 2: ");
        double bilangan2 = Data.nextDouble();

        System.out.println("Masukan operator (+ , - , * , / , % ");
        char operator = Data.next().charAt(0);

        Data.close();

        double result ;
        
        switch (operator) {
            case '+':
                result = bilangan + bilangan2; 
                break;
            case '-':
                result = bilangan - bilangan2;
                break;
            case '*':
                result = bilangan * bilangan2;
                break;
            case '/':
                result = bilangan / bilangan2;
                break;
            case '%':
                result = bilangan % bilangan2;
                break;
            default:
                System.out.println("Masukan operator yang benar");
                return; 
        }    
        System.out.println("Result dari operasi " + operator + " adalah " + result);
    }
                            
}
