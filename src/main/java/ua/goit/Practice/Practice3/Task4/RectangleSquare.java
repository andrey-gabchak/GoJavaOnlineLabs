package ua.goit.Practice.Practice3.Task4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by coura on 21.05.2016.
 * Знайти площу яку займають N прямокутників на площині.
 У всіх прямокутників одна зі сторін лежить на осі абсцис (X).
 Дано три масива довжиною N.
 В першому масиві Х координата нижньої-лівої вершини і-го прямокутника ,
 висота в другому, ширина в третьому. Всі значення невід'ємні.
 Приклад:
 X - [0, 0]
 H - [20, 10]
 W - [10, 20]
 Відповідь - 300.
 */
public class RectangleSquare {

    public int measure(int[] x, int[] h, int[] w) {
        int result = 0;
        List<Integer[]> inputRectangle = new LinkedList<>(); //Сохраняем размеры первоначальных прямоугольников
        List<Integer> arrayX = new LinkedList<>();
        List<Integer> arrayY = new LinkedList<>();

        for (int i = 0; i < x.length; i++) {
            int X1 = x[i];
            int Y1 = 0;
            int X2 = x[i] + w[i];
            int Y2 = h[i];
            arrayX.add(X1);
            arrayY.add(Y1);
            arrayX.add(X2);
            arrayY.add(Y2);
            inputRectangle.add(new Integer[]{X1, Y1, X2, Y2});
        }

        Collections.sort(arrayX);
        Collections.sort(arrayY);
        removeSame(arrayX);
        removeSame(arrayY);

        for (int i = 0; i < arrayX.size() - 1; i++) {
            for (int j = 0; j < arrayY.size() - 1; j++) {
                for (Integer[] integers : inputRectangle) {

                    /**
                     * arrayX.get(i) >= integers[0] && arrayY.get(j) >= integers[1]
                     * чтобы продвигаться по фигурам слево на право
                     *
                     * arrayX.get(i + 1) <= integers[2] && arrayY.get(j + 1) <= integers[3]
                     * чтобы выбирать наименьшею фигуру
                     */

                    if (arrayX.get(i) >= integers[0] && arrayX.get(i + 1) <= integers[2]
                            && arrayY.get(j) >= integers[1] && arrayY.get(j + 1) <= integers[3]) {

                        result += getArea(arrayX.get(i), arrayY.get(j), arrayX.get(i + 1), arrayY.get(j + 1));
                        break;
                    }
                }
            }
        }
        return result;
    }

    private static List<Integer> removeSame(List<Integer> input) {
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i).equals(input.get(i + 1))) {
                input.remove(i);
                i--;
            }
        }
        return input;
    }

    private static int getArea(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (y2 - y1);
    }
}