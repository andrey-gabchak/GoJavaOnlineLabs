package ua.goit.Practice2.Task7;

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
// implementation using a BigInteger
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

    //Implementation using cycle and charArray
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

    //Implementation using stringBuilder
    String addString(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int lengthOfMaxString;
        String stringOfMaxLength;

        if (a.length() > b.length()) {
            lengthOfMaxString = a.length();
            stringOfMaxLength = a;
        } else {
            lengthOfMaxString = b.length();
            stringOfMaxLength = b;
        }

        int remainder = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lengthOfMaxString; i++) {
            if (i < a.length() && i < b.length()) {
                if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    result.append(remainder);
                    remainder = 1;
                } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    result.append(remainder);
                    remainder = 0;
                } else {
                    if (remainder == 0) {
                        result.append(1);
                        remainder = 0;
                    } else {
                        result.append(0);
                        remainder = 1;
                    }
                }


            } else {
                if (stringOfMaxLength.charAt(i) == '1' && remainder == 1) {
                    result.append(0);
                } else if (stringOfMaxLength.charAt(i) == '0' && remainder == 0) {
                    result.append(0);
                } else {
                    result.append(1);
                    remainder = 0;
                }
            }
        }
        if (remainder == 1) result.append(1);
        return result.reverse().toString();
    }
}
