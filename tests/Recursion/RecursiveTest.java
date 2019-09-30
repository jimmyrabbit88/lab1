package Recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveTest {

    @Test
    void smallestFirst() {
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
}