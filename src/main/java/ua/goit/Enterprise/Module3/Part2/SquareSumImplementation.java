package ua.goit.Enterprise.Module3.Part2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * Created by coura on 07.07.2016.
 */
public class SquareSumImplementation implements SquareSum {


    @Override
    public long getSquareSum(int[] values, int numberOfThreads) throws InterruptedException, ExecutionException {
        Phaser phaser = new Phaser(numberOfThreads);
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        List<Callable<Long>> callables = new ArrayList<>();
        IntStream.range(0, numberOfThreads).forEach(i -> callables.add(() -> {
            long threadResult = 0;
            int start = i * values.length/numberOfThreads;
            int end = (i+1) * values.length/numberOfThreads;

            for (int j = start; j < end; j++) {
                threadResult += values[j] * values[j];
            }
            System.out.println(Thread.currentThread().getName() + " result = " + threadResult);
            phaser.arriveAndAwaitAdvance();
            return threadResult;
        }));

        List<Future<Long>> resultsOfParts = executorService.invokeAll(callables);
        long finalResult = 0;
        for (Future<Long> resultOfPart : resultsOfParts) {
            finalResult += resultOfPart.get();
        }

        executorService.shutdown();
        return finalResult;
    }


}

