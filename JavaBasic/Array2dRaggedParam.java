package JavaBasic;

public class Array2dRaggedParam {
    public static void main(String[] args) {
        
        int[][] numbers = {
            {3, 5, 7},
            {10, 2},
            {12, 14, 16, 17, 18}
        };
        printArray(numbers);
    }
    public static void printArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {  
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "");
            }    
            System.out.println();
        }
    }
}
