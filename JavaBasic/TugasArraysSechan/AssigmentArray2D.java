package JavaBasic.TugasArraysSechan;

import java.util.Scanner;

/* 
    * Dibawah ini adalah input untuk jalur sesuai nomor.
    
    * 1. LLLLLUUULRLDDLDRUULLLUUU
    * 2. LLLLLUUULLDDDRLUULLLUUU
    * 3. LLLLUUUUR
    * 4. LLLLLUUULLDDLDUULLLUUU  
*/

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

        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan tenaga awal: ");
            int energy = input.nextInt();

            input.nextLine();

            System.out.print("Masukkan jalur pendakian: ");
            String pathway = input.nextLine();

            int playerRow = 5;
            int playerCol = 11;
            boolean restInTheWrongPost = false;

            for (int i = 0; i < pathway.length(); i++) {
                char path = pathway.charAt(i);

                if (path == 'R') {
                    String currentPos = semeruClimb[playerRow][playerCol];
                    if (currentPos.equals("P2") || currentPos.equals("P3") ||
                        currentPos.equals("P4") || currentPos.equals("P5") ||
                        currentPos.equals("RK") || currentPos.equals("TC")) {
                        energy += 10;
                    } else {
                        if (playerCol < semeruClimb[0].length - 1 && !semeruClimb[playerRow][playerCol + 1].equals("X")) {
                            playerCol++; 
                            energy--; 
                        } else {
                            restInTheWrongPost = true;
                            break; 
                        }
                    }
                } else if (path == 'L' && playerCol > 0) {
                    playerCol--;
                    energy--; 
                } else if (path == 'R' && playerCol < semeruClimb[0].length - 1) {
                    playerCol++;
                    energy--; 
                } else if (path == 'U' && playerRow > 0) {
                    playerRow--;
                    energy--; 
                } else if (path == 'D' && playerRow < semeruClimb.length - 1) {
                    playerRow++;
                    energy--; 
                } else {
                    System.out.println("Tolong masukan input rute yang benar, seperti L, R, U, D, K.");
                    return;
                }

                if (energy <= 0) {
                    System.out.println("Jalur anda benar, tapi tenaga anda tidak akan kuat, coba jalur lain atau sempatkan istirahat terlebih dahulu.");
                    return;
                } else if (semeruClimb[playerRow][playerCol].equals("X")) {
                    System.out.println("Jalur anda salah, anda masuk ke jurang/blank 45.");
                    return;
                } else if (semeruClimb[playerRow][playerCol].equals("P")) {
                    System.out.println("Selamat Pendakian anda berhasil mencapai Puncak Mahameru, sisa tenaga anda " + energy + ".");
                    return;
                }
            }

            if (restInTheWrongPost) {
                System.out.println("Mohon maaf, istirahat hanya diperbolehkan di Pos-pos yang tersedia.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}