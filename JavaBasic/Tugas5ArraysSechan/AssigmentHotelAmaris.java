package JavaBasic.Tugas5ArraysSechan;

public class AssigmentHotelAmaris {    
    public static void main(String[] args) {
        
        String[][] hotelAmaris = {
            {"*", "*", "*", "X", "*"},
            {"*", "*", "*", "*", "*"},  
            {"*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "X"},
        };

        String findGuest = "X";
        int emptyRoom = 0;

        for (int f = 0; f < hotelAmaris.length; f++) { // f = floor
            for (int r = 0; r < hotelAmaris[f].length; r++){ // r = room
                if (hotelAmaris[f][r].equals(findGuest)) {
                    System.out.println("Tamu berada di Lantai " + (4 - f) + " Kamar " + (r + 1) );
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
