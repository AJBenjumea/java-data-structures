package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static datastructures.MergeSort.mergesort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTests {
    int [] list;

    @BeforeEach
    void setUp() {
        list = new int[]{5,2,9,12,1,19,7};
    }

    @Test
    void whenArrayIsUnsorted_returnsSorted() {
        mergesort(list, 0 , list.length - 1);
        int[] expected = new int[]{1,2,5,7,9,12,19};
        assertArrayEquals(expected, list, "Should sort list");
    }
}
