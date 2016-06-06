package ua.goit.Enterprise.Module2.ImplementationOfInterfaces;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 06.06.2016.
 */
public class NumberValidatorTest {
    private static NumberValidator numberValidator;

    @BeforeClass
    public static void setUp() throws Exception {
        numberValidator = new NumberValidator();
    }

    @Test
    public void testIsValidInteger() throws Exception {
        Integer input = 10;
        assertEquals(true, numberValidator.isValid(input));
    }

    @Test
    public void testIsValidLong() throws Exception {
        Long input = 10L;
        assertEquals(true, numberValidator.isValid(input));
    }

    @Test
    public void testIsValidDouble() throws Exception {
        Double input = 10D;
        assertEquals(true, numberValidator.isValid(input));
    }

    @Test
    public void testIsValidNumber() throws Exception {
        Number input = 10;
        assertEquals(true, numberValidator.isValid(input));
    }
}