package ua.goit.Enterprise.Module1.CollectionImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by coura on 05.06.2016.
 */

public class TimeOfOperations {

    private static Operations operations = new Operations();

    public ArrayList<String> getListTime(List<Integer> list, int count) {
        ArrayList<String> resultList = new ArrayList<>();
        //Maximum time taken
        resultList.add(list.getClass().getSimpleName());
        String populateTime = String.valueOf(operations.getTimePopulate(list, count));
        resultList.add(String.valueOf(operations.getTimeAddByIndex(list, count / 2)));
        resultList.add(String.valueOf(operations.getTimeGetByIndex(list, count / 2)));
        resultList.add(String.valueOf(operations.getTimeRemoveByIndex(list, 1)));
        resultList.add(String.valueOf(operations.getTimeContains(list, count / 2)));
        resultList.add(populateTime);
        resultList.add(String.valueOf(operations.getTimeIteratorAdd(list)));
        resultList.add(String.valueOf(operations.getTimeIteratorRemove(list)));

        return resultList;
    }

    public ArrayList<String> getSetTime(Set<Integer> set, int count) {
        ArrayList<String> resultList = new ArrayList<>();
        String populateTime = String.valueOf(operations.getTimePopulate(set, count));
        resultList.add(set.getClass().getSimpleName());
        resultList.add(String.valueOf(operations.getTimeAddValue(set, count + 1)));
        resultList.add(String.valueOf(operations.getTimeRemoveValue(set, count / 2)));
        resultList.add(String.valueOf(operations.getTimeContains(set, count / 2)));
        resultList.add(populateTime);
        //crutches for library write to file
        resultList.add("-");
        resultList.add("-");
        resultList.add("-");

        return resultList;
    }



}
