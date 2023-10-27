package JavaBasic.Tugas5ArraysSechan;

//import java.util.concurrent.Flow;

public class Assigment1 {    
    public static void main(String[] args) {
        
        String[][] hotelAmaris = {
            {"*", "*", "*", "X", "*"},
            {"*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "*"},
            {"*", "X", "*", "*", "*"},
        };

        String findGuest = "X";
        int emptyRoom = 0;

        for (int f = 0; f < hotelAmaris.length; f++) {
            for (int r = 0; r < hotelAmaris[f].length; r++){
                if (hotelAmaris[f][r].equals(findGuest)) {
                    System.out.println("Tamu berada di Lantai " + (f + 1) + " Kamar " + (r + 1) );
                }
                if (hotelAmaris[f][r].equals("*")) {
                    emptyRoom++;
                }
            }    
        }          
        if (emptyRoom == 0) {
            System.out.println("Semua kamar telah terisi");
        }else {
            System.out.println("Jumlah kamar yang tersedia adalah " + emptyRoom + " kamar.");
        }
        
    }    
}
