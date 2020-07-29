package com.sai.core.interfaces;

public interface MethodInterface {

    default void doSomenthing(){
        System.out.println("Interface Default Method");
    }

    default void method1(){
        System.out.println("Interface Default Method 1");
    }

    void abstractMethod(String s);


}
