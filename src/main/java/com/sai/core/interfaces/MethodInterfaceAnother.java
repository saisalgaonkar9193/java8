package com.sai.core.interfaces;

public interface MethodInterfaceAnother {
    default void doSomenthing(){
        System.out.println("Another Interface Default Method");
    }

    void abstractMethod(String s);
}
