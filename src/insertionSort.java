import java.util.Random;

public class insertionSort {

    int[] array;
    int n;
    boolean madeSwap;

    public insertionSort() {

        //construct random array
        makeArray(8);
        //print unsorted array
        System.out.print("Random list: ");
        printArray();
        //sort array
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
        for (int k = array.length; k > 0; k--) {
            while (madeSwap) {
                madeSwap = false;
                for (int i = 1; i < (k); i++) {
                    if (array[i - 1] > array[i]) {
                        n = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = n;
                        madeSwap = true;
                    }
                }

            }
            //isSorted();
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbles = new BubbleSort();
    }

    public boolean isSorted() {
        for (int j = 0; j < (array.length - 1); j++) {
            if (array[j] > array[j + 1]) {
                return false;
            }
        }
        printArray();
        return true;
    }




}