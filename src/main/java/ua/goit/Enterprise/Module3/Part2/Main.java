package ua.goit.Enterprise.Module3.Part2;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

/**
 * Created by coura on 07.07.2016.
 */

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random(10);
        int[] values = new int[10];
        IntStream.range(0, 10).forEach(i -> values[i] = random.nextInt(20));
        IntStream.range(0, 10).forEach(i -> System.out.print(values[i] + " "));

        System.out.println();
        System.out.println(new SquareSumImplementation().getSquareSum(values, 3));
    }
}
