package ua.goit.Enterprise.Module1.CollectionImplementation;

import java.util.LinkedList;

/**
 * Created by coura on 02.06.2016.
 */
public class TimeOfLinkedList {

    private static Operations operations = new Operations();
    private static LinkedList<Integer> linkedList = new LinkedList<>();

    //10K
    private long timeAddIndex10K = operations.timeAddByIndex(linkedList, 5 * 1000);
    private long timeGetIndex10K = operations.timeGetByIndex(linkedList, 5 * 1000);
    private long timeRemoveIndex10K = operations.timeRemoveByIndex(linkedList, 1);
    private long timeContains10K = operations.timeContains(linkedList, 5 * 1000);
    private long timePopulate10K = operations.timePopulate(linkedList, 10 * 1000);
    private long timeIteratorAdd10K = operations.timeIteratorAdd(linkedList);
    private long timeIteratorRemove10K = operations.timeIteratorRemove(linkedList);

    //100K
    private long timeAddIndex100K = operations.timeAddByIndex(linkedList, 50 * 1000);
    private long timeGetIndex100K = operations.timeGetByIndex(linkedList, 50 * 1000);
    private long timeRemoveIndex100K = operations.timeRemoveByIndex(linkedList, 1);
    private long timeContains100K = operations.timeContains(linkedList, 50 * 1000);
    private long timePopulate100K = operations.timePopulate(linkedList, 100 * 1000);
    private long timeIteratorAdd100K = operations.timeIteratorAdd(linkedList);
    private long timeIteratorRemove100K = operations.timeIteratorRemove(linkedList);

    //1000K
    private long timeAddIndex1000K = operations.timeAddByIndex(linkedList, 500 * 1000);
    private long timeGetIndex1000K = operations.timeGetByIndex(linkedList, 500 * 1000);
    private long timeRemoveIndex1000K = operations.timeRemoveByIndex(linkedList, 1);
    private long timeContains1000K = operations.timeContains(linkedList, 500 * 1000);
    private long timePopulate1000K = operations.timePopulate(linkedList, 1000 * 1000);
    private long timeIteratorAdd1000K = operations.timeIteratorAdd(linkedList);
    private long timeIteratorRemove1000K = operations.timeIteratorRemove(linkedList);

    public long getTimeAddIndex10K() {
        return timeAddIndex10K;
    }

    public long getTimeGetIndex10K() {
        return timeGetIndex10K;
    }

    public long getTimeRemoveIndex10K() {
        return timeRemoveIndex10K;
    }

    public long getTimeContains10K() {
        return timeContains10K;
    }

    public long getTimePopulate10K() {
        return timePopulate10K;
    }

    public long getTimeIteratorAdd10K() {
        return timeIteratorAdd10K;
    }

    public long getTimeIteratorRemove10K() {
        return timeIteratorRemove10K;
    }

    public long getTimeAddIndex100K() {
        return timeAddIndex100K;
    }

    public long getTimeGetIndex100K() {
        return timeGetIndex100K;
    }

    public long getTimeRemoveIndex100K() {
        return timeRemoveIndex100K;
    }

    public long getTimeContains100K() {
        return timeContains100K;
    }

    public long getTimePopulate100K() {
        return timePopulate100K;
    }

    public long getTimeIteratorAdd100K() {
        return timeIteratorAdd100K;
    }

    public long getTimeIteratorRemove100K() {
        return timeIteratorRemove100K;
    }

    public long getTimeAddIndex1000K() {
        return timeAddIndex1000K;
    }

    public long getTimeGetIndex1000K() {
        return timeGetIndex1000K;
    }

    public long getTimeRemoveIndex1000K() {
        return timeRemoveIndex1000K;
    }

    public long getTimeContains1000K() {
        return timeContains1000K;
    }

    public long getTimePopulate1000K() {
        return timePopulate1000K;
    }

    public long getTimeIteratorAdd1000K() {
        return timeIteratorAdd1000K;
    }

    public long getTimeIteratorRemove1000K() {
        return timeIteratorRemove1000K;
    }
}
