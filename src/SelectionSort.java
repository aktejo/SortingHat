import java.util.Random;

public class SelectionSort {

    int[] array;
    int n;
    boolean madeSwap;
    int currentMin;

    public SelectionSort() {

        //construct random array
        makeArray(8);
        //print unsorted array
        System.out.print("Random list: ");
        printArray();
        //sort array
        sortArray();
        sortArray();
        //print sorted array to make sure it worked
        System.out.print("Sorted list: ");
        printArray();

    }

    public void makeArray(int lengthOfArray) {
        array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = (int) (lengthOfArray * Math.random() + 1);
        }
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            if (i != (array.length - 1)) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

    public void sortArray() {
        System.out.println("sort array is running");
        for (int k = array.length; k > 0; k--) {
            currentMin = array[array.length-k];
            for (int i = (array.length-k); i < array.length; i++) {
                if (array[i] < currentMin) {
                        array[i] = currentMin;
                }
            }
            array[array.length-k] = currentMin;
            for (int i = 0; i < array.length; i++) {
                if (i != (array.length - 1)) {
                    System.out.print(array[i] + ", ");
                } else {
                    System.out.print(array[i]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbles = new BubbleSort();
    }



}