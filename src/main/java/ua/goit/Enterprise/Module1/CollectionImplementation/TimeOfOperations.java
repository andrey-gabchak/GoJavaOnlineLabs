package ua.goit.Enterprise.Module1.CollectionImplementation;

import java.util.*;

/**
 * Created by coura on 05.06.2016.
 */

public class TimeOfOperations {

    private static Operations operations = new Operations();
    private List<List<String>> resultFor10K = getTimeList(10000);
    private List<List<String>> resultFor100K = getTimeList(100000);
    private List<List<String>> resultFor1000K = getTimeList(1000000);

    public List<List<String>> getResultFor10K() {
        return resultFor10K;
    }

    public List<List<String>> getResultFor100K() {
        return resultFor100K;
    }

    public List<List<String>> getResultFor1000K() {
        return resultFor1000K;
    }

    public List<List<String>> getTimeList(int count) {
        return Arrays.asList(
                getListTime(new ArrayList<Integer>(), count),
                getListTime(new LinkedList<Integer>(), count),
                getSetTime(new HashSet<Integer>(), count),
                getSetTime(new TreeSet<Integer>(), count)
        );
    }

    private ArrayList<String> getListTime(List<Integer> inputList, int count) {
        ArrayList<String> resultList = new ArrayList<>();
        //Maximum time taken
        resultList.add(inputList.getClass().getSimpleName());
        String populateTime = String.valueOf(operations.getTimePopulate(inputList, count));
        resultList.add(getAverageTimeAddByIndex(inputList, count));
        resultList.add(getAverageTimeGetTimeByIndex(inputList, count));
        resultList.add(getAverageTimeRemoveByIndex(inputList, count));
        resultList.add(getAverageTimeContains(inputList, count));
        resultList.add(populateTime);
        resultList.add(String.valueOf(operations.getTimeIteratorAdd(inputList)));
        resultList.add(String.valueOf(operations.getTimeIteratorRemove(inputList)));

        return resultList;
    }

    private ArrayList<String> getSetTime(Set<Integer> inputSet, int count) {
        ArrayList<String> resultList = new ArrayList<>();
        String populateTime = String.valueOf(operations.getTimePopulate(inputSet, count));
        resultList.add(inputSet.getClass().getSimpleName());
        resultList.add(getAverageTimeAddValue(inputSet, count));
        resultList.add(getAverageTimeRemoveValue(inputSet, count));
        resultList.add(getAverageTimeContains(inputSet, count));
        resultList.add(populateTime);
        //crutches for library write to file
        resultList.add("-");
        resultList.add("-");
        resultList.add("-");

        return resultList;
    }

    private String getAverageTimeAddByIndex(List<Integer> list, int count) {
        long average = 0;
        for (int i = 0; i < 100; i++) {
            long time = operations.getTimeAddByIndex(list, new Random().nextInt(count));
            if (i < 1) average += time;
            average = (average + time) / 2;
        }
        return String.valueOf(average);
    }

    private String getAverageTimeGetTimeByIndex(List<Integer> list, int count) {
        long average = 0;
        for (int i = 0; i < 100; i++) {
            long time = operations.getTimeGetByIndex(list, new Random().nextInt(count));
            if (i < 1) average += time;
            average = (average + time) / 2;
        }
        return String.valueOf(average);
    }

    private String getAverageTimeRemoveByIndex(List<Integer> list, int count) {
        long average = 0;
        for (int i = 0; i < 100; i++) {
            long time = operations.getTimeRemoveByIndex(list, new Random().nextInt(count));
            if (i < 1) average += time;
            average = (average + time) / 2;
        }
        return String.valueOf(average);
    }

    private String getAverageTimeContains(Collection<Integer> collection, int count) {
        long average = 0;
        for (int i = 0; i < 100; i++) {
            long time = operations.getTimeContains(collection, new Random().nextInt(count));
            if (i < 1) average += time;
            average = (average + time) / 2;
        }
        return String.valueOf(average);
    }

    private String getAverageTimeAddValue(Set<Integer> set, int count) {
        long average = 0;
        for (int i = 0; i < 100; i++) {
            average = (operations.getTimeAddValue(set, new Random().nextInt(count) - count) +
                    operations.getTimeAddValue(set, new Random().nextInt(count) + count)) / 2;
        }
        return String.valueOf(average);
    }

    private String getAverageTimeRemoveValue(Set<Integer> set, int count) {
        long average = 0;
        for (int i = 0; i < 100; i++) {
            long time = operations.getTimeRemoveValue(set, new Random().nextInt(count));
            if (i < 1) average += time;
            average = (average + time) / 2;
        }
        return String.valueOf(average);
    }

}
