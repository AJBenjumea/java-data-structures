package test;

import datastructures.QuickSort;
import static datastructures.QuickSort.quicksort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortTests {
    List<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>(Arrays.asList(5,2,9,12,1,19,7));
    }

    @Test
    void whenArrayIsUnsorted_returnsSorted() {
        quicksort(list, 0 , list.size() - 1);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,5,7,9,12,19));
        assertEquals(expected, list, "Should sort list in place");
    }
}
