package ua.goit.Module10;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

/**
 * Created by coura on 09.04.2016.
 */
public class IOFileTest {

    private static IOFile ioFile;
    private static String fileName = "test.txt";

    @BeforeClass
    public static void setUpClass() throws Exception {
        ioFile = new IOFile();
    }

    @Test
    public void testWriterAndReader() throws Exception {
        String text = "abcdefghijklmnopqrstuvwxyz";

        ioFile.writer(fileName, text);

        String readResult = ioFile.reader(fileName);

        Assert.assertEquals(text + "\n", readResult);

    }
}