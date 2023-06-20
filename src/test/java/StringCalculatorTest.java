import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private StringCalculator manipulatedstring;

    @BeforeEach
    public void setUp() {
        manipulatedstring = new NegativeString();
    }

    @AfterEach
    public void tearDown() {
        manipulatedstring = null;
    }

//    This test checks basic functionality for the add()
    @Test
    public void testCount1() {
        manipulatedstring.add("1, 2");
        int expectedResult = 4;
        assertEquals(4, expectedResult);
    }
}
