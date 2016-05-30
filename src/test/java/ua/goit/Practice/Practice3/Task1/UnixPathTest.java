package ua.goit.Practice.Practice3.Task1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 16.05.2016.
 */
public class UnixPathTest {

    UnixPath unixPath = new UnixPath();

    @Test
    public void testSimplifyLastSlash() throws Exception {
        String expected = "/var/lib";

        String result = unixPath.simplify("/var//lib/");

        assertEquals(expected, result);
    }

    @Test
    public void testSimplifyTwoSlashOnly() throws Exception {
        String expected = "/";

        String result = unixPath.simplify("//");

        assertEquals(expected, result);
    }

    @Test
    public void testSimplifySlashAndPointInPath() throws Exception {
        String expected = "/var/lib/file.txt";

        String result = unixPath.simplify("/home/../var/./lib//file.txt");

        assertEquals(expected, result);
    }

    @Test
    public void testSimplifySlashAndPointNoFile() throws Exception {
        String expected = "/var/lib";

        String result = unixPath.simplify("/home/../var/./lib//");

        assertEquals(expected, result);
    }
    @Test
    public void testSimplifySlashAndPointOnly() throws Exception {
        String expected = "/";

        String result = unixPath.simplify("/.");

        assertEquals(expected, result);
    }

    @Test
    public void testSimplifyLongPath() throws Exception {
        String expected = "/var/tmp/data";

        String result = unixPath.simplify("/var/lib/../log/./../tmp/data///.");

        assertEquals(expected, result);
    }

    @Test
    public void testSimplifyBullshit() throws Exception {
        String expected = "/";

        String result = unixPath.simplify("/../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../...");

        assertEquals(expected, result);
    }

}