package JavaBasic.Tugas5ArraysSechan;

import java.util.Scanner;

public class AssigmentArray2D {
    public static void main(String[] args) {
        
        String[][] semeruClimb = {
            {"P", "X", "X", "X", "X", "X", "X", "X", "X", "", "", ""},
            {"", "X", "", "", "", "X", "X", "P3", "X", "", "X", "",},
            {"", "X", "X", "X", "","P4", "", "", "", "", "X", "",},
            {"", "TC", "", "", "", "X", "", "", "X", "X", "X", "",},
            {"", "", "X", "", "", "X", "P2", "X", "X", "X", "X", "",},
            {"P5", "", "X", "RK", "","X", "", "", "", "", "", "P1",},
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tenaga anda: ");
        int energy = input.nextInt();

        input.nextLine();

        System.out.println("Masukan Jalur anda: ");
        String pathway = input.nextLine();
        
        int playerRow = 5;
        int playerCol = 11;

        input.close();

        for (int i = 0; i < semeruClimb.length; i++) {
            for (int j = 0; j < semeruClimb[i].length; j++) {
                System.out.print(semeruClimb[i][j] + " ");
            }
            System.out.println();
        }

        switch (pathway.toLowerCase()) {
            case "L":
                if (playerCol > 0 && !semeruClimb[playerRow][playerCol - 1].equals("X")) {
                    semeruClimb[playerRow][playerCol] = "";
                    playerCol--;
                    semeruClimb[playerRow][playerCol] = "P1";
                } else {
                    System.out.println("Anda tidak dapat bergerak ke kiri.");
                }
                break;
            case "R":
                if (playerCol < semeruClimb[playerRow].length - 1 && !semeruClimb[playerRow][playerCol + 1].equals("X")) {
                    semeruClimb[playerRow][playerCol] = "";
                    playerCol++;
                    semeruClimb[playerRow][playerCol] = "P1";
                } else {
                    System.out.println("Anda tidak dapat bergerak ke kanan.");
                }
                break;
            case "U":
                if (playerRow > 0 && !semeruClimb[playerRow - 1][playerCol].equals("X")) {
                    semeruClimb[playerRow][playerCol] = "";
                    playerRow--;
                    semeruClimb[playerRow][playerCol] = "P1";
                } else {
                    System.out.println("Anda tidak dapat bergerak ke atas.");
                }
            case "q":
                System.out.println("Permainan berakhir.");
                input.close();
                return;
            default:
                System.out.println("Perintah tidak valid. Gunakan L, R, atau Q.");
        }
    
        /* 

        if (pathway.equalsIgnoreCase("L")) {
            if (playerCol > 0 && !semeruClimb[playerRow][playerCol - 1].equals("X")) {
                playerCol--;
                semeruClimb[playerRow][playerCol] = "P1";
            } else {
                System.out.println("Anda tidak dapat bergerak ke kiri.");
            }
        }  
        */
    }
}
