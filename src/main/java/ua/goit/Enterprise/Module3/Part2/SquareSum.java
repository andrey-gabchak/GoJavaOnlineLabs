package ua.goit.Enterprise.Module3.Part2;

import java.util.concurrent.ExecutionException;

/**
 * Created by coura on 06.07.2016.
 *
 * The task
 *
 * Используя Phaser и Executors реализовать класс,
 * который бы считал сумму квадратов элементов массива параллельно в заданном количестве потоков.
 *
 * Идея в том, чтобы разбить массив на равные части и найти сумму квадратов
 * в каждом кусочке в отдельном потоке параллельно.
 *
 * Используя Phaser, дождаться результатов всех вычислений и сложить их, получив конечный результат.
 */

public interface SquareSum {

    long getSquareSum(int[] values, int numberOfThreads) throws InterruptedException, ExecutionException;
}
