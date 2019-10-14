package BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void contains() {
        BinarySearchTree myTree = new BinarySearchTree();

        boolean res = myTree.contains("aaaa");
        assertFalse(res);

        myTree.insert("january");

        res = myTree.contains("january");
        assertTrue(res);

        res = myTree.contains("march");
        assertFalse(res);

        myTree.insert("february");
        myTree.insert("march");
        myTree.insert("april");
        myTree.insert("may");
        myTree.insert("june");

        res = myTree.contains("april");
        assertTrue(res);

        res = myTree.contains("july");
        assertFalse(res);

    }

    @Test
    void containsIter() {
        BinarySearchTree myTree = new BinarySearchTree();

        boolean res = myTree.containsIter("aaaa");
        assertFalse(res);

        myTree.insert("january");

        res = myTree.containsIter("january");
        assertTrue(res);

        res = myTree.containsIter("march");
        assertFalse(res);

        myTree.insert("february");
        myTree.insert("march");
        myTree.insert("april");
        myTree.insert("may");
        myTree.insert("june");

        res = myTree.containsIter("april");
        assertTrue(res);

        res = myTree.containsIter("july");
        assertFalse(res);

    }
}