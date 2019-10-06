package Recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveTest {

    @Test
    void smallest() {
        int[][] testingArrays = {
                {1, 3, 5, 7},
                {7, 5, 3, 2},
                {5, 8, 3, 8, 7},
                {2, 2, 2, 2},
                {-4, 6, -10, 8}
        };
        int[] exp = {1, 2, 3, 2, -10};

        for(int i=0; i<testingArrays.length; i++){
            int expected = exp[i];
            int res = Recursive.smallest(testingArrays[i]);
            assertEquals(expected, res);
        }
    }

    @Test
    void BinarySearch() {
        int[][] testingArrays = {
                {1, 3, 5, 7},
                {7, 5, 3, 2},
                {5, 8, 3, 8, 7},
                {2, 2, 2, 2},
                {-4, 6, -10, 8}
        };
        int[] find = {1, 3, 7, 5, -10};
        int[] exp = {0, 2, 4, -1, 2};

        for(int i=0; i<testingArrays.length; i++){
            int expected = exp[i];
            int res = Recursive.binarySearch(testingArrays[i], find[i]);
            assertEquals(expected, res);
        }
    }
}