package com.sai.concurrency;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {

    private Integer num;

    public Factorial(Integer num) {
        this.num = num;
    }

    public Integer call() throws Exception {
        Thread.sleep(8000);
        return factorial(num);
    }

    private static int factorial(int num) {
        return num == 1 ? 1 : num*factorial(--num);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
