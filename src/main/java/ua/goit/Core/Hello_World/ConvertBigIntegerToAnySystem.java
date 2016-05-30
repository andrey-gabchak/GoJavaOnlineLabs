package ua.goit.Core.Hello_World;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by coura on 15.05.2016.
 */
public class ConvertBigIntegerToAnySystem {

    // Converts from decimal to any system
    private static String convertDecimalTo(BigInteger decimalNumber, Integer system) {
        final List<Character> VALID_CHARS = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z');
        String result = "";
        HashMap<BigInteger, Character> indexesAndValidChars = new HashMap<>();

        for (Character validSymbol : VALID_CHARS) {
            indexesAndValidChars.put(BigInteger.valueOf(VALID_CHARS.indexOf(validSymbol)), validSymbol);
        }

        List<Character> resultNumberChars = new ArrayList<>();

        while (!decimalNumber.equals(BigInteger.ZERO)) {
            resultNumberChars.add(indexesAndValidChars.get(decimalNumber.mod(BigInteger.valueOf(system))));
            decimalNumber = decimalNumber.divide(BigInteger.valueOf(system));
        }

        Collections.reverse(resultNumberChars);

        for (Character s : resultNumberChars) {
            result += (s.toString());
        }

        return result;
    }
}
