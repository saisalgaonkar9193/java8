package com.sai.core;

import java.util.function.DoubleSupplier;

public class FinalTest implements FinalInterface{

    public static void main(String[] args) {

        new FinalTest()
//                .doThis("");
        .m(8);

    }


    @Override
    public void doThis( String str) {

//        str="";
        DoubleSupplier doubleSupplier = () -> {
            return str.length();
        };

    }

    void m(final int param) {
        new Thread(new Runnable() {
            public void run() {
                System.err.println(param);
            }
        }).start();
    }
}
@FunctionalInterface
interface FinalInterface{
    public void doThis(final String str);

}

class Empl{

}