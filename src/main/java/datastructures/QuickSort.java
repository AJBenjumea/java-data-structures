package datastructures;

import java.util.List;

import static java.util.Collections.swap;


public class QuickSort {
    public static void quicksort(List<Integer> array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = array.get(Math.round((left + right) / 2));
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    public static int partition(List<Integer> array, int left, int right, int pivot) {
        while(left <= right) {
            while(array.get(left) < pivot) {
                left++;
            }
            while(array.get(right) > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

}

// Walk-through
    // Random pivot point
        // elements < pivot come before elements > pivot
        // Repeat and apply to left & right side

// l            p   r
// 15 3 9 8 5 2 7 1 6

// Move l and r until you find element that should be on other side. Then swap.
//     l       p r
// 6 3 9 8 5 2 7 1 15


// Time Complexity: average -> O(nlogn)
// Time Complexity : worst -> O(n^2)
