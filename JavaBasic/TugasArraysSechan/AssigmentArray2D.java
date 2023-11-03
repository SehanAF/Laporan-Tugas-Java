package JavaBasic.TugasArraysSechan;

import java.util.Scanner;

public class AssigmentArray2D {
    public static void main(String[] args) {
        String[][] semeruClimb = {
            {"P", "X", "X", "X", "X", "X", "X", "X", "X", "", "", ""},
            {"", "X", "", "", "", "X", "X", "P3", "X", "", "X", "",},
            {"", "X", "X", "X", "", "P4", "", "", "", "", "X", "",},
            {"", "TC", "", "", "", "X", "", "", "X", "X", "X", "",},
            {"", "", "X", "", "", "X", "P2", "X", "X", "X", "X", "",},
            {"P5", "", "X", "RK", "", "X", "", "", "", "", "", "P1",},
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tenaga awal: ");
        int energy = input.nextInt();

        System.out.print("Masukkan jalur pendakian: ");
        String pathway = input.next();

        int playerRow = 5;
        int playerCol = 11;

        input.close();

        for (int i = 0; i < pathway.length(); i++) {
            char path = pathway.charAt(i);
            energy--;

            if (path == 'L' && playerCol > 0) {
                playerCol--;
            } else if (path == 'R' && playerCol < semeruClimb[0].length - 1) {
                playerCol++;
            } else if (path == 'U' && playerRow > 0) {
                playerRow--;
            } else if (path == 'D' && playerRow < semeruClimb.length - 1) {
                playerRow++;
            } else if (path == 'R') {
                String currentPos = semeruClimb[playerRow][playerCol];
                if (currentPos.equals("P2") ||
                    currentPos.equals("P3") ||
                    currentPos.equals("P4") ||
                    currentPos.equals("P5") ||
                    currentPos.equals("RK") ||
                    currentPos.equals("TC")) {
                    energy += 10;
                } else {
                    System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos yang tersedia");
                    return;
                }
            }

            if (energy <= 0) {
                System.out.println("Jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu");
                return;
            }

            if (playerRow < 0 || playerRow >= semeruClimb.length ||
                playerCol < 0 || playerCol >= semeruClimb[0].length) {
                System.out.println("Jalur anda salah, anda masuk ke jurang");
                return;
            }

            if (semeruClimb[playerRow][playerCol].equals("P")) {
                System.out.println("Selamat Pendakian anda berhasil mencapai Puncak Mahameru, sisa tenaga anda " + energy);
                return;
            }
        }
    }
}
