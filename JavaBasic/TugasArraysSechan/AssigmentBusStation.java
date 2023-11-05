package JavaBasic.TugasArraysSechan;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AssigmentBusStation {
    public static void main(String[] args) {

        ArrayList<String> busLine = new ArrayList<>();
        busLine.add("Sukabumi - Cianjur");
        busLine.add("Cianjur - Bandung");
        busLine.add("Bandung - Garut");
        busLine.add("Garut - Tasik");
        busLine.add("Tasik - Ciamis");
        busLine.add("Ciamis - Banjar");

        double[] rates = {10_000, 15_000, 7_500, 5_000, 7_500, 6_000};

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Kota keberangkatan: ");
        String departureCity = input.nextLine();

        System.out.print("Masukan Kota tujuan: ");
        String cityDestination = input.nextLine();
        
        System.out.print("Apakah penumpang anggota TNI dan POLRI (ya/tidak): ");
        String whenTNI_Polri = input.nextLine();

        input.close();
        
        // harus belajar oop
        for (int i = 0; i < busLine.size(); i++) {
            for (int j = i + 1; j < busLine.size(); j++) {
                if (busLine.get(i).contains(departureCity) && busLine.get(j).contains(cityDestination)) {
                    double rate = rates[i] + rates[j];
                    DecimalFormat decimalFormat = new DecimalFormat("#,###");
                    if (whenTNI_Polri.equalsIgnoreCase("ya")) {
                        rate *= 0.9; 
                    } else if ((busLine.equals("Sukabumi - Banjar") || busLine.equals("Banjar - Sukabumi"))) {
                        rate *= 0.95; 
                    }
                    System.out.println("Harga tiket: " + decimalFormat.format(rate));
                    break;
                }
                
            }
        }
        
    }
}
