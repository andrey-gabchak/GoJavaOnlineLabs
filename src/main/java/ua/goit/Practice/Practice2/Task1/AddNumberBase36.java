package ua.goit.Practice.Practice2.Task1;

/**
 * Created by coura on 29.04.2016.
 * Дано 2 числа в системі числення з основою 36. Будь-яка цифра може бути в межах [0-9a-z].
 * Повернути суму чисел, також в системі 36.
 * Наприклад:
 * "9" + "1" = "a"
 * "z" + "1" = "10"
 */

public class AddNumberBase36 {

    public String add(String a, String b) {

        String numbers = "0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        a = new StringBuilder(a).reverse().toString().toLowerCase();
        b = new StringBuilder(b).reverse().toString().toLowerCase();

        int lengthOfMaxString;
        String stringOfMaxLength;
        if (a.length() >= b.length()){
            lengthOfMaxString = a.length();
            stringOfMaxLength = a;
        }else {
            lengthOfMaxString = b.length();
            stringOfMaxLength = b;
        }

        int remainder = 0;
        for (int i = 0; i < lengthOfMaxString; i++) {
            try {
                int sumOfIndex = numbers.indexOf(a.charAt(i)) + numbers.indexOf(b.charAt(i));
                if (sumOfIndex + remainder < 36) {
                    result.append(numbers.charAt(sumOfIndex + remainder));
                    remainder = 0;
                } else {
                    result.append(numbers.charAt(sumOfIndex + remainder - 36));
                    remainder = 1;
                }
            }catch (IndexOutOfBoundsException e){
                for (int j = i; j < lengthOfMaxString; j++) {
                    int index = numbers.indexOf(stringOfMaxLength.charAt(j));
                    if (index + remainder < 36) {
                        result.append(numbers.charAt(index + remainder));
                        remainder = 0;
                    } else {
                        result.append(numbers.charAt(index + remainder - 36));
                        remainder = 1;
                    }
                }
                break;
            }
        }
        if (remainder == 1) result.append(1);
        return result.reverse().toString();
    }

}
