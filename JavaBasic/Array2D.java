package JavaBasic;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        
        // Mengambil array tanpa loop
        Integer[][] angka = new Integer[2][2]; // [[0, 0], [0, 0]] 
        
        angka[0][0] = 3; // [[3, ], [0, 0]] 
        angka[0][1] = 5; // [[3, 5], [0, 0]] 

        angka[1][0] = 10; // [[3, 5], [10, 0]] 
        angka[1][1] = 2; // [[3, 5], [10, 2]] 

        // Mengambil array dengan nested loop
        int[][] numbers = {
            {3, 5, 7},
            {10, 2, 9}
        };

        // Mengambil 2 baris dan 3 kolom
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(numbers[i][j] + "");
            }
            System.out.println();
        }

        // Mengambil 3 baris dan 2 kolom
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(numbers[j][i] + "");
            }
            System.out.println();
        }

        // convert array int to string
        System.out.println(Arrays.toString(numbers));

        // menggunakan method untuk langsung mengambil array
        System.out.println(Arrays.deepToString(numbers));
    }

}
