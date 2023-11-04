package JavaBasic.TugasArraysSechan;

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

        double[] rates = {10000, 15000, 7500, 5000, 7500, 6000};

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Kota keberangkatan: ");
        String departureCity = input.nextLine();

        System.out.print("Masukan Kota tujuan: ");
        String cityDestination = input.nextLine();
        
        System.out.print("Apakah penumpang anggota TNI dan POLRI (ya/tidak): ");
        String whenTNI_Polri = input.nextLine();

        input.close();
        
    }
}
