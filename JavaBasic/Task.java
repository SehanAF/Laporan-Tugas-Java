package JavaBasic;

import java.util.Scanner;

public class Task {
    
    public static void main(String[] args) {
        int nilai = 89;
        String result = "";
        if (nilai >= 85 && nilai <=100) {
            result = "A";
        } 
        else if(nilai >= 75 && nilai <=84){
            result= "B";
        }
        else if(nilai >=70 && nilai <=74){
            result= "C";
        }
        else if(nilai >=50 && nilai <=69){
            result = "D";
        }
        else if(nilai >=0 && nilai <=49){
            result = "E";
        }
        else{
            result = "Input Anda Salah";
        }
        System.out.println( "Nilai Anda Adalah "  + result);


        Scanner Input = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        double Bilangan1 = Input.nextDouble();

        System.out.print("Masukkan Angka : ");
        double Bilangan2 = Input.nextDouble();

        System.out.println("Operator +,-,,/,%");
        char operator = Input.next().charAt(0);

        Input.close();

        double hasil;

        switch(operator){
                
            case '+':
                hasil = Bilangan1 + Bilangan2;
                break;
                
            case '-':
                hasil = Bilangan1 - Bilangan2;
                break;
            case '*':
                hasil = Bilangan1 * Bilangan2;
                break;
            case '/':
                hasil = Bilangan1 / Bilangan2;
                break;
            case '%':
                hasil = Bilangan1 % Bilangan2;
                break;
            default: 
            System.out.println("Input Anda Salah");
            return;

        }   
        
        System.out.println("Hasil Dari Operasi " + operator +" Adalah " + hasil);
    }
}
