package Tugas10Sort;

public class NomorB {
    public static void main(String[] args) {
        String[] data = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};

        bubbleSortDescending(data);

        System.out.println("Data after sorting in descending order:");
        displayData(data);
    }

    public static void bubbleSortDescending(String[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void displayData(String[] array) {
        for (String city : array) {
            System.out.print(city + " ");
        }
    }
}

