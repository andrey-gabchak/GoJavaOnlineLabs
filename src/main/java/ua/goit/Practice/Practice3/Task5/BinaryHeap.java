package ua.goit.Practice.Practice3.Task5;

/**
 * Created by coura on 21.05.2016.
 *
 *Реалізуйте структуру даних  - Бінарна Купа (Binary Heap).
 Конструктор проймає один параметр size.
 Методи insert(int) що працює за O(logN) і poll(),
 який видаляє і повертає максимальне число з купи і також працює за O(logN).

 Изначальное описание задачи хуёвей некуда.
 Предполагаю, что в конструктор, под параметром size, необходимо принимать высоту бинарной купы.
 Далее метод insert должен вставлять элемент в бинарную кучу.
 А метод pull извлекать максимальный элемент.
 Второе, это можно решить с помощью TreeMap. Насколько я понимаю,
 TreeMap как раз сортирует элементы в виде бинарной кучи.
 НО тогда конструктор не нужен.
 */

import java.util.TreeMap;

public class BinaryHeap {

    private TreeMap<Integer, Integer> integerTreeMap = new TreeMap<>();

    public BinaryHeap(int size) {

    }

    public void insert(int val) {
        integerTreeMap.put(val, val);
    }

    public int poll() {
        if (integerTreeMap.size() > 0) {
            int max = integerTreeMap.lastKey();
            integerTreeMap.remove(max);
            return max;
        }
        return 0;
    }
}

