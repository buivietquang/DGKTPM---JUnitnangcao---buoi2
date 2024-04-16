
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddCheckerTest2 {

    @Test
    void testInvalidInput() {
        String result = EvenOddChecker.checkEvenOdd("abc");
        assertEquals("Dau vao khong hop le", result);
    }
}

