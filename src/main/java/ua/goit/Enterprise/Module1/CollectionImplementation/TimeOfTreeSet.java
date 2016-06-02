package ua.goit.Enterprise.Module1.CollectionImplementation;

import java.util.TreeSet;

/**
 * Created by coura on 02.06.2016.
 */
public class TimeOfTreeSet {

    private static Operations operations = new Operations();
    private static TreeSet<Integer> treeSet = new TreeSet<>();

    private long timeContains10K = operations.timeContains(treeSet, 5 * 1000);
    private long timePopulate10K = operations.timePopulate(treeSet, 10 * 1000);
    private long timeRemoveValue10K = operations.timeRemoveValue(treeSet, 5 * 1000);
    private long timeAddValue10K = operations.timeAddValue(treeSet, 5 * 1000);

    private long timeContains100K = operations.timeContains(treeSet, 50 * 1000);
    private long timePopulate100K = operations.timePopulate(treeSet, 100 * 1000);
    private long timeRemoveValue100K = operations.timeRemoveValue(treeSet, 50 * 1000);
    private long timeAddValue100K = operations.timeAddValue(treeSet, 50 * 1000);

    private long timeContains1000K = operations.timeContains(treeSet, 500 * 1000);
    private long timePopulate1000K = operations.timePopulate(treeSet, 1000 * 1000);
    private long timeRemoveValue1000K = operations.timeRemoveValue(treeSet, 500 * 1000);
    private long timeAddValue1000K = operations.timeAddValue(treeSet, 500 * 1000);

    public long getTimeContains10K() {
        return timeContains10K;
    }

    public long getTimePopulate10K() {
        return timePopulate10K;
    }

    public long getTimeRemoveValue10K() {
        return timeRemoveValue10K;
    }

    public long getTimeAddValue10K() {
        return timeAddValue10K;
    }

    public long getTimeContains100K() {
        return timeContains100K;
    }

    public long getTimePopulate100K() {
        return timePopulate100K;
    }

    public long getTimeRemoveValue100K() {
        return timeRemoveValue100K;
    }

    public long getTimeAddValue100K() {
        return timeAddValue100K;
    }

    public long getTimeContains1000K() {
        return timeContains1000K;
    }

    public long getTimePopulate1000K() {
        return timePopulate1000K;
    }

    public long getTimeRemoveValue1000K() {
        return timeRemoveValue1000K;
    }

    public long getTimeAddValue1000K() {
        return timeAddValue1000K;
    }
}
