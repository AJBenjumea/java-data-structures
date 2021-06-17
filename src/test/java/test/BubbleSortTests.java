package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static datastructures.BubbleSort.bubblesort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTests {
    int [] list;

    @BeforeEach
    void setUp() {
        list = new int[]{5,2,9,12,1,19,7};
    }

    @Test
    void whenArrayIsUnsorted_returnsSorted() {
        bubblesort(list);
        int[] expected = new int[]{1,2,5,7,9,12,19};
        assertArrayEquals(expected, list, "Should sort list");
    }
}
