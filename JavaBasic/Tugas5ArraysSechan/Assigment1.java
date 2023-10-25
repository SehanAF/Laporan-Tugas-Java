package JavaBasic.Tugas5ArraysSechan;

public class Assigment1 {    
    public static void main(String[] args) {
        
        String[][] hotelAmaris = {
            {"*", "*", "*", "X", "*"},
            {"*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "X"},
        };

        String findGuest = "X";

        int indeksFloors = -1;
        int indeksRoom = -1;

        int floor = 3;
        for(String[] floorsArrays: hotelAmaris) {
            floor++;
            int room = 0;
            for (String roomArrays: floorsArrays) {
                room++;
                if (roomArrays.equals(findGuest)) {
                    indeksFloors = floor;
                    indeksRoom = room;
                    break;
                }
            }   
            if (indeksFloors != -1) {
                break; 
            }
        }

        if (indeksFloors != -1) {
            System.out.println("Tamu berada di Lantai " + indeksFloors + " Kamar " + indeksRoom);
        } else {
            System.out.println("Tamu tidak ditemukan");
        }       
    } 
}
