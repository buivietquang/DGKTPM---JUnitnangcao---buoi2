import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// testEvenNumber
class EvenOddCheckerTest {

    @Test
    void testEvenNumber() {
        String result = EvenOddChecker.checkEvenOdd(2);
        assertEquals("So 2 la so chan.", result);
    }

    @Test
    void testOddNumber() {
        String result = EvenOddChecker.checkEvenOdd(3);
        assertEquals("So 3 la so le.", result);
    }

    @Test
    void testZero() {
        String result = EvenOddChecker.checkEvenOdd(0);
        assertEquals("So 0 la so chan.", result);
    }

    @Test
    void testNegativeEvenNumber() {
        String result = EvenOddChecker.checkEvenOdd(-4);
        assertEquals("So -4 la so chan.", result);
    }

    @Test
    void testNegativeOddNumber() {
        String result = EvenOddChecker.checkEvenOdd(-5);
        assertEquals("So -5 la so le.", result);
    }
}
