package ua.goit.Enterprise.Module1.CollectionImplementation;

import java.util.*;

/**
 * Created by coura on 30.05.2016.
 *
 * List
     populate (наполнение коллекции)
     contains(value)
      add(index)
      remove(index)
      get(index)
      ListIterator.add()
      ListIterator.remove()
 Set
     populate (наполнение коллекции)
     contains(value)
      add(value)
      remove(value)
 */

public class Operations {

    /**
     * The methods for list and set.
     * @param collection
     * @param count
     * @return
     */
    public long timePopulating(Collection<Integer> collection, int count) {
        Integer[] arrayForPopulate = new Integer[count];
        for (int i = 0; i < count; i++) {
            arrayForPopulate[i] = i;
        }
        long startTime = System.currentTimeMillis();
        collection.addAll(Arrays.asList(arrayForPopulate));
        return System.currentTimeMillis() - startTime;
    }

    public long timeContaining(Collection<Integer> collection, int value) {
        long startTime = System.currentTimeMillis();
        collection.contains(value);
        return System.currentTimeMillis() - startTime;
    }


    /**
     * The methods for the list only.
     * @param list
     * @param index
     * @return
     */
    public long timeAddingIndex(List<Integer> list, int index) {
        long startTime = System.currentTimeMillis();
        list.add(index);
        return System.currentTimeMillis() - startTime;
    }


    public long timeRemovingIndex(List<Integer> list, int index) {
        long startTime = System.currentTimeMillis();
        list.remove(index);
        return System.currentTimeMillis() - startTime;
    }

    public long timeGetting(List<Integer> list, int index) {
        long startTime = System.currentTimeMillis();
        list.get(index);
        return System.currentTimeMillis() - startTime;
    }

    public long timeListIteratorAdding(List<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = list.listIterator();
        for (int i = 0; i < count; i++) {
            iterator.add(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    //TODO: должно удалять все значения или определенное количество значений?
    public long timeListIteratorRemoving(List<Integer> list) { //Пока удаляет все значения в коллекции
        long startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * The methods for the set only.
     * @param set
     * @param value
     * @return
     */
    public long timeAddingValue(Set<Integer> set, Integer value) {
        long startTime = System.currentTimeMillis();
        set.add(value);
        return System.currentTimeMillis() - startTime;
    }

    public long timeRemovingValue(Set<Integer> set, Integer value) {
        long startTime = System.currentTimeMillis();
        set.remove(value);
        return System.currentTimeMillis() - startTime;
    }
}
