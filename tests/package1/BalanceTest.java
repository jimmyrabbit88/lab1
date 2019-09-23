package package1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void isBalanced() {
        boolean exp = true;
        boolean result = Balance.isBalanced("3(5<g> { 777777 }[]5)");
        assertEquals(exp, result);

        exp = false;
        result = Balance.isBalanced("4( jj ({}){}[<>]] 676 )");
        assertEquals(exp, result);
    }
}