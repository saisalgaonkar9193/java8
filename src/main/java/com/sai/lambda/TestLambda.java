package com.sai.lambda;

import com.sai.functional.TestFunctional;

import java.util.Arrays;
import java.util.function.Consumer;

public class TestLambda {
    private String test = "Enclosing scope value";
    public static void main(String[] args) {

//        System.out.println(new TestLambda().scopeExperiment());
        String[] total = {"Hi"};
        System.out.println(Arrays.toString(total));
        Consumer<String> r = (n) ->
//        str="Hello";
                total[0]=total[0]+n;
        r.accept("sai");
        r.accept("name");
        System.out.println(Arrays.toString(total));

    }

    public String scopeExperiment () {
        TestFunctional fooIC = new TestFunctional() {
            String value = "Inner class value";

            @Override
            public String doSomething(String string) {
                System.out.println(test);
                return this.value;
            }
        };
        String resultIC = fooIC.doSomething("");

        TestFunctional fooLambda = parameter -> {
            String value = "Lambda value";
            return value;
        };
        String resultLambda = fooLambda.doSomething("");

        return "Results: resultIC = " + resultIC +
                ", resultLambda = " + resultLambda;
    }
}
