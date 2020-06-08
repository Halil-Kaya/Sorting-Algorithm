/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siralamaalgoritmalari;

/**
 *
 * @author minter
 */
public class SiralamaAlgoritmalari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {9, 7, 8, 1, 5, 4, 3, 2, 6};

        selectionSort(array);
        print(array);

    }

    //selection sort
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;

            }

        }

    }
    
    //insertionSort
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];

            int j = i - 1;
            while (j >= 0 && currentElement < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = currentElement;
        }
    }

    //bubleSort
    public static void bubleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean isSwapped = false;

            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    isSwapped = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            System.out.print(i + ". pass : ");
            print(array);

            if (!isSwapped) {
                System.out.println(array.length + " numbers sorted in " + i + " passes");
                break;
            }
        }
    }

    public static void print(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
