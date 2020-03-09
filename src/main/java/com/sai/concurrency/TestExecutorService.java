package com.sai.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExecutorService {

    public static void main(String[] args) {

        System.out.println("Welcome To Executor Service");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> submit = executorService.submit(new Factorial(5));

        System.out.println(submit.isDone());

        try {
            System.out.println(submit.isDone());
            System.out.println(submit.get());
            System.out.println(submit.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
