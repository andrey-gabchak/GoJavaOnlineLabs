package ua.goit.Practice2;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by coura on 29.04.2016.
 * Add the two unsigned numbers that is transmitted as strings.
 * "101" + "100" = "1001"
 */
public class AddBinary {
    public static void main(String[] args) {

    }
// implementation with BigInteger
//    String add(String a, String b) {
//
//        BigInteger aBig = new BigInteger(a, 2);
//        BigInteger bBig = new BigInteger(b, 2);
//
//        BigInteger result = aBig.add(bBig);
//
//        String sResult = result.toString(2);
//
//        return sResult;
//    }

    //Implementation with cycle
    String add(String a, String b) {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        StringBuilder result;

        if (aArray.length >= bArray.length) {
            result = addBinary(aArray, bArray);
        } else {
            result = addBinary(bArray, aArray);
        }

        return result.toString();
    }

    private StringBuilder addBinary(char[] aArray, char[] bArray) {
        StringBuilder result = new StringBuilder();

        int surplus = 0;
        int difference = aArray.length - bArray.length;
        for (int i = bArray.length - 1; i >= 0; i--) {
            int aNum = aArray[i + difference] - '0';
            int bNum = bArray[i] - '0';

            int sum = aNum + bNum + surplus;

            if (sum == 0) {
                result.insert(0, '0');
            } else if (sum == 1) {
                result.insert(0, '1');
            } else if (sum == 2) {
                result.insert(0, '0');
                if ((i == 0) && (aArray.length == bArray.length)) {
                    result.insert(0, '1');
                } else {
                    surplus = 1;
                }
            } else if (sum == 3) {
                result.insert(0, '1');
                if ((i == 0) && (aArray.length == bArray.length)) {
                    result.insert(0, '1');
                } else {
                    surplus = 1;
                }
            }
        }
        if (aArray.length > bArray.length) {
            int greaterNumber = aArray.length - difference;
            int lastNumber = aArray.length - 1;
            for (int i = lastNumber; i >= greaterNumber; i--) {
                int sum = aArray[i] - '0' + surplus;
                if (sum < 2) {
                    result.insert(0, aArray[i]);
                    surplus = 0;
                } else if (sum == 2) {
                    result.insert(0, '0');
                    if (i == greaterNumber) {
                        result.insert(0, '1');
                    } else {
                        surplus = 1;
                    }
                } else if (sum == 3) {
                    result.insert(0, '1');
                    if (i == greaterNumber) {
                        result.insert(0, '1');
                    } else {
                        surplus = 1;
                    }
                }
            }
        }
        return result;
    }
}
