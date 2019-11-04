package Graphs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {

    private Graph testMatrixGraphNotDirected;
    private Graph testMatrixGraphDirected;
    @BeforeEach
    void before(){
        testMatrixGraphDirected = new MatrixGraph(5, true);
        testMatrixGraphNotDirected = new MatrixGraph(5, false);
        testMatrixGraphDirected.insert(new Edge(0,1));
        testMatrixGraphNotDirected.insert(new Edge(0,1));
    }


    @org.junit.jupiter.api.Test
    void isEdge() {
        boolean testIsEdge = testMatrixGraphDirected.isEdge(0,1);
        boolean testIsNotEdge = testMatrixGraphDirected.isEdge(0,0);

        assertTrue(testIsEdge);
        assertFalse(testIsNotEdge);
    }

    @org.junit.jupiter.api.Test
    void insertDirected() {
        boolean result = testMatrixGraphDirected.isEdge(0, 1);
        boolean resultOfOpposite = testMatrixGraphDirected.isEdge(1, 0);

        assertTrue(result);
        assertFalse(resultOfOpposite);
    }

    @org.junit.jupiter.api.Test
    void insertNotDirected() {
        boolean result = testMatrixGraphNotDirected.isEdge(0, 1);
        boolean resultDir = testMatrixGraphNotDirected.isEdge(1, 0);

        assertTrue(result);
        assertTrue(resultDir);
    }

    @org.junit.jupiter.api.Test
    void removeDirected() {
        testMatrixGraphDirected.insert(new Edge(1, 0));
        testMatrixGraphDirected.remove(new Edge(0,1));
        boolean result = testMatrixGraphDirected.isEdge(0, 1);
        boolean resultOfOpposite = testMatrixGraphDirected.isEdge(1, 0);

        assertFalse(result);
        assertTrue(resultOfOpposite);
    }

    @org.junit.jupiter.api.Test
    void removeNotDirected() {
        testMatrixGraphDirected.insert(new Edge(1, 0));
        testMatrixGraphDirected.remove(new Edge(0,1));
        boolean result = testMatrixGraphDirected.isEdge(0, 1);
        boolean resultOfOpposite = testMatrixGraphDirected.isEdge(1, 0);

        assertFalse(result);
        assertFalse(resultOfOpposite);
    }

    @org.junit.jupiter.api.Test
    void breadthFirstTraversal() {
    }

    @org.junit.jupiter.api.Test
    void depthFirstTraversal() {
    }
}