package JavaBasic;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
        String[] stringsArray;
        stringsArray = new String[3];

        stringsArray[0] = "Sehun";
        stringsArray[1] = "Alfarisi";
        stringsArray[2] = "Alexa";

        System.out.println(stringsArray[0]);
        System.out.println(stringsArray[1]);
        System.out.println(stringsArray[2]);

        stringsArray[0] = "Alexa";

        System.out.println(stringsArray[0]);

        String[] stringArrays2 = new String[3];

        System.out.println(stringArrays2);

        // Array Initializer (singkat)

        String[] namaNama = {
            "Akbar", "Ikok", "Alfa"
        };

        System.out.println(Arrays.toString(namaNama));

        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        System.out.println(Arrays.toString(arrayInt));

        long[] arrayLong = {
            10L, 20L, 30L, 40L 
        };

        System.out.println(Arrays.toString(arrayLong));

        // Operasi di Arrays

        arrayLong[0] = 100; //mengubah data 10 => 100
        System.out.println(arrayLong.length);

        // Array di dalam array
        
        String[][] members = {
            {"Raka", "Gibran"},
            {"Al", "Lexa"},
            {"Naruto", "Shippuden"}
        };

        System.out.println((members[0][1]));
        System.out.println((members[1][0]));

    }
}
