import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private NegativeString manipulatedstring;

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
    public void testAdd1() {
        int result = manipulatedstring.add("1, 2");
        int expectedResult = 3;
        assertEquals(expectedResult, result);
    }
//  This tests the case for when the value exceeds 1000
    @Test
    public void testAdd2() {
        int result = manipulatedstring.add("1, 1002");
        int expectedResult = 3;
        assertEquals(expectedResult, result);
    }

//  This tests the case for when the value exceeds 1000
    @Test
    public void testAdd3() {
        int result = manipulatedstring.add("1, 2004");
        int expectedResult = 5;
        assertEquals(expectedResult, result);
    }

//  This tests the case for when negative value is entered
    @Test
    public void testAddException1() {
        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> {
                    manipulatedstring.add("1,-2");
                }, "negative number -2 was entered.");
    }

    @Test
    public void testAddException2() {
        IllegalArgumentException thrown =
                assertThrows(IllegalArgumentException.class, () -> {
                    manipulatedstring.add("-1,2");
                }, "negative number -1 was entered.");
    }
}
