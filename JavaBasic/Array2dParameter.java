package JavaBasic;

public class Array2dParameter {
    public static void main(String[] args) {
        int[][] numbers = getArray();
        printArray(numbers);
    }

    public static int[][] getArray() {
        return new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    }

    // ver 1
    /* 
    public static void printArray(int[][] numbers) {
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j]);
            }    
        }
    }
    */

    //ver 2
    public static void printArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {  
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
            }    
            System.out.println();
        }
    }
}