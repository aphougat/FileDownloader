package com.cosmoneural;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {


    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(300);
        for(int i=100000; i <= 150000; i++)
        {
            Task task = new Task(i);
            executor.execute(task::run);
        }
    }
}
