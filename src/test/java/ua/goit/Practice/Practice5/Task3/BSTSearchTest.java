package ua.goit.Practice.Practice5.Task3;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 23.05.2016.
 */
public class BSTSearchTest {

    private static BSTSearch bstSearch;

    @BeforeClass
    public static void setUp() throws Exception {
        bstSearch = new BSTSearch();

    }

    @Test
    public void testExist() throws Exception {
        TreeNode treeNode = new TreeNode(0, null, null);

        boolean result = bstSearch.exist(treeNode, 0);

        assertEquals(true, result);
    }
}