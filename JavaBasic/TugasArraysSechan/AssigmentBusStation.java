package JavaBasic.TugasArraysSechan;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AssigmentBusStation {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Sukabumi");
        city.add("Cianjur");
        city.add("Bandung");
        city.add("Garut");
        city.add("Tasik");
        city.add("Ciamis");
        city.add("Banjar");


        HashMap<String, Integer> busRates = new HashMap<>();
        busRates.put("Sukabumi-Cianjur", 10000);
        busRates.put("Cianjur-Bandung", 15000);
        busRates.put("Bandung-Garut", 7500);
        busRates.put("Garut-Tasik", 5000);
        busRates.put("Tasik-Ciamis", 7500);
        busRates.put("Ciamis-Banjar", 6000);

        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan kota keberangkatan: ");
            String keberangkatan = input.nextLine();

            System.out.print("Masukkan kota tujuan: ");
            String tujuan = input.nextLine();

            System.out.print("Apakah penumpang TNI/POLRI? (ya/tidak): ");
            boolean isTniPolri = input.nextLine().equalsIgnoreCase("ya");


        } catch (Exception e) {
            
        }
        
        
    }
}
