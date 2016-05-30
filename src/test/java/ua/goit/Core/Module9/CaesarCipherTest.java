package ua.goit.Core.Module9;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by coura on 09.04.2016.
 *
 * Unit-tests for encoding and decoding of Caesar cipher.
 */

public class CaesarCipherTest {

    private static CaesarCipher caesarCipher;
    private static int key = 10;

    @BeforeClass
    public static void setUpClass() throws Exception {
        caesarCipher = new CaesarCipher();
    }

    @Test
    public void testEncode() throws Exception {
        String openText = "Съешь ещё этих мягких французских булок, да выпей же чаю, " +
                "The quick brown fox jumps over the lazy dog";

        String result = caesarCipher.encode(openText, key);

        assertEquals("Ыдогё овё жьтя цилфтя юъйчаэсыфтя кэхшф, нй мещоу ро бйз, " +
                "Dro aesmu lbygx pyh tewzc yfob dro vkji nyq", result);

    }

    @Test
    public void testDecode() throws Exception {
        String encodeText = "Ыдогё овё жьтя цилфтя юъйчаэсыфтя кэхшф, нй мещоу ро бйз, " +
                "Dro aesmu lbygx pyh tewzc yfob dro vkji nyq";

        String result = caesarCipher.decode(encodeText, key);

        assertEquals("Съешё ещё этих мягких французских булок, да выпей же чаю, " +
                "The quick brown fox jumps over the lazy dog", result);
    }
}