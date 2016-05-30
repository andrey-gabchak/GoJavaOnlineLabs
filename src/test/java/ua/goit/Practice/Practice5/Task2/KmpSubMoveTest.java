package ua.goit.Practice.Practice5.Task2;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 23.05.2016.
 */
public class KmpSubMoveTest {

    private static KmpSubMove kmpSubMove;

    @BeforeClass
    public static void setUp() throws Exception {
        kmpSubMove = new KmpSubMove();

    }

    @Test
    public void testSubMoveQuantityCount2() throws Exception {
        String inputStr = "abcd";
        String resultStr = "cdab";
        int expected = 2;
        int result = kmpSubMove.subMoveQuantity(inputStr, resultStr);

        assertEquals(expected, result);
    }

    @Test
    public void testSubMoveQuantityCount3() throws Exception {
        String inputStr = "abcd";
        String resultStr = "bcda";
        int expected = 3;
        int result = kmpSubMove.subMoveQuantity(inputStr, resultStr);

        assertEquals(expected, result);
    }

    @Test
    public void testSubMoveQuantityWrongInputStr() throws Exception {
        String inputStr = "abcdd";
        String resultStr = "bcda";
        int expected = -1;
        int result = kmpSubMove.subMoveQuantity(inputStr, resultStr);

        assertEquals(expected, result);
    }
}