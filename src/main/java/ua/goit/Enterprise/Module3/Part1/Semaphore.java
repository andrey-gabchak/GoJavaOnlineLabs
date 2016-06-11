package ua.goit.Enterprise.Module3.Part1;

/**
 * Created by coura on 09.06.2016.
 */
public interface Semaphore {

    public void acquire();

    public void acquire(int permits);

    public void release();

    public void release(int permits);

    public int getAvailablePermits();
}
