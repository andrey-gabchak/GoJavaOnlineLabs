package ua.goit.Practice3.Task1;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by coura on 16.05.2016.
 * Дано повний шлях до файла в Unix системі.
 * Наприклад /home/../var/./lib//file.txt
 * Необхідно повернути спрощений варіант. (/var/lib/file.txt)
 */
public class UnixPath {
    public String simplify(String input) {
        input = input.replace("...", "");

        StringTokenizer stringTokenizer = new StringTokenizer(input, "/");
        ArrayList<String> list = new ArrayList<>();

        while (stringTokenizer.hasMoreTokens()) {
            list.add(stringTokenizer.nextToken());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(".")) {
                list.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("..")) {
                list.remove(i);
                if (i >= 1) {
                    list.remove(i - 1);
                    i--;
                }
                i--;
            }
        }

        StringBuilder resultBuilder = new StringBuilder();

        for (String s : list) {
            resultBuilder.append("/");
            resultBuilder.append(s);
        }
        String result = resultBuilder.toString();

        if (result.isEmpty()) {
            result = "/";
        }

        return result;
    }
}
