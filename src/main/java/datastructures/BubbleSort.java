package datastructures;

import static java.util.Collections.swap;

public class BubbleSort {
    public static void bubblesort(int[] array) {
        boolean isSorted = false;
        int lastSorted = array.length - 1;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastSorted; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
            lastSorted--;
        }

    }
}

// Time Complexity : O(n^2)
// Space Complexity : O(n)