package ua.goit.Practice2;

import java.math.BigInteger;

/**
 * Created by coura on 29.04.2016.
 *
 * Add the two unsigned numbers that is transmitted as strings.
 * "101" + "100" = "1001"
 */
public class AddBinary {
    public static void main(String[] args) {

    }

    String add(String a, String b) {
        if (a == "0" && b == "0") return "0";

        long aNum = Long.parseLong(a, 2);
        long bNum = Long.parseLong(b, 2);
        long result = aNum + bNum;

        StringBuilder stringBuilder = new StringBuilder();
        while (result > 0) {
            stringBuilder.insert(0, result & 1);
            result >>= 1;
        }

        return stringBuilder.toString();
    }
}
