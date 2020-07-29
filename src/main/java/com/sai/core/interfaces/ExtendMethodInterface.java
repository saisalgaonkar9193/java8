package com.sai.core.interfaces;

public class ExtendMethodInterface implements MethodInterface,MethodInterfaceAnother{

    public static void main(String[] args) {
        ExtendMethodInterface e=new ExtendMethodInterface();

//        e.doSomenthing();
//        e.abstractMethod("v");
//        e.abstractMethod("s");

        System.out.println("John Smith".hashCode());
        System.out.println("Sandra Dee".hashCode());

    }

    @Override
    public void doSomenthing() {
        MethodInterface.super.doSomenthing();
        MethodInterfaceAnother.super.doSomenthing();
    }

    @Override
    public void abstractMethod(String s) {
        System.out.println(s.hashCode());

        System.out.println(s.hashCode()& 15);
    }
}
