import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void addFirst() {
        CP3LinkedList<String> testList = new CP3LinkedList();

        testList.addFirst("test");
        String result = testList.getFirst();
        String exp = "test";
        assertEquals(result, exp);
    }

    @Test ()
    void getFirst() {
        CP3LinkedList<String> testList = new CP3LinkedList();

        Assertions.assertThrows(NoSuchElementException.class, () -> { testList.getFirst(); });



        testList.addFirst("test");
        String result = testList.getFirst();
        String exp = "test";
        assertEquals(result, exp);

    }

    @Test
    void removeFirst() {
        CP3LinkedList<String> testList = new CP3LinkedList();

        Assertions.assertThrows(NoSuchElementException.class, () -> { testList.removeFirst(); });

        testList.addFirst("test");
        testList.addFirst("testremove");
        testList.removeFirst();
        String result = testList.getFirst();
        String exp = "test";
        assertEquals(result, exp);
    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> testList = new CP3LinkedList();

        //test arrat without data
        boolean result = testList.isEmpty();
        boolean expected = true;
        assertEquals(expected, result);

        //test array with data
        testList.addFirst("hello");
        expected = false;
        result = testList.isEmpty();

        assertEquals(expected, result);
    }

    @Test
    void size() {
        CP3LinkedList<String> testList = new CP3LinkedList();
        testList.addFirst("test");
        testList.addFirst("test2");
        testList.addFirst("test3");

        int result = testList.size();
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void addLast() {
        CP3LinkedList<String> testList = new CP3LinkedList();
        testList.addLast("test");
        String result = testList.getFirst();
        String exp = "test";
        assertEquals(result, exp);

        testList.addLast("testLast");
        result = testList.getFirst();
        exp = "test";
        assertEquals(result, exp);

        int sizeResult = testList.size();
        int sizeExpected = 2;
        assertEquals(sizeExpected, sizeResult);

    }
}