package ua.goit.Practice.Practice4.Task1;

/**
 * Created by coura on 23.05.2016.
 *
 * Дано ланки трьох кольорів: білого і 1 м завдовжки, жовтого - 2 м і червоного - 3 м.
 Скількома способами можна зібрати, з них, ланцюжок довжиною  N.
 Кількість наявних ланок кожного кольору вважати бескінечною.
 */

public class ColorChain {
    public int count(int length) {
        if (length <= 2) return length;
        if (length == 3) return 4;
        return count(length - 1) + count(length - 2) + count(length - 3);
    }
}
