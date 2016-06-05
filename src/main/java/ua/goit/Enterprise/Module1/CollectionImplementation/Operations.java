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
     * Common methods
     */

    private Integer[] millionArray;

    public long getTimePopulate(Collection<Integer> collection, int count) {
        Integer[] arrayToPopulate = Arrays.copyOfRange(getMillionArray(), 0, count);

        long startTime = System.currentTimeMillis();
        collection.addAll(Arrays.asList(arrayToPopulate));
        return System.currentTimeMillis() - startTime;
    }

    private Integer[] getMillionArray() {
        millionArray = new Integer[1000000];
        for (int i = 0; i < 1000000; i++) {
            millionArray[i] = i;
        }
        return millionArray;
    }

    public long getTimeContains(Collection<Integer> collection, int value) {
        long startTime = System.currentTimeMillis();
        collection.contains(value);
        return System.currentTimeMillis() - startTime;
    }

    /**
     * The methods for the list only.
     */
    public long getTimeAddByIndex(List<Integer> list, int index) {
        long startTime = System.currentTimeMillis();
        list.add(index);
        return System.currentTimeMillis() - startTime;
    }


    public long getTimeRemoveByIndex(List<Integer> list, int index) {
        long startTime = System.currentTimeMillis();
        list.remove(index);
        return System.currentTimeMillis() - startTime;
    }

    public long getTimeGetByIndex(List<Integer> list, int index) {
        long startTime = System.currentTimeMillis();
        list.get(index);
        return System.currentTimeMillis() - startTime;
    }

    public long getTimeIteratorRemove(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String s = String.valueOf(iterator.next());
            iterator.remove();
        }
        return System.currentTimeMillis() - startTime;
    }

    public long getTimeIteratorAdd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.add(iterator.next());
        }
        return System.currentTimeMillis() - startTime;
    }

    /**
     * The methods for the set only.
     */
    public long getTimeAddValue(Set<Integer> set, Integer value) {
        long startTime = System.currentTimeMillis();
        set.add(value);
        return System.currentTimeMillis() - startTime;
    }

    public long getTimeRemoveValue(Set<Integer> set, Integer value) {
        long startTime = System.currentTimeMillis();
        set.remove(value);
        return System.currentTimeMillis() - startTime;
    }
}
