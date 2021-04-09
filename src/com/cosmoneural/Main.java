package com.cosmoneural;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {


    private static final int THREAD_COUNT = 300;
    private static final int MIN_COUNT = 100000;
    private static final int MAX_COUNT = 150000;

    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(THREAD_COUNT);
        for(int i=MIN_COUNT; i <= MAX_COUNT; i++)
        {
            Task task = new Task(i);
            executor.execute(task);
        }
    }
}
