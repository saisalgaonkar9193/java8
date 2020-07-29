package com.sai.core;

public class IntegerConstantPool {

    public static void main(String[] args) {
        Integer i1=127;
        Integer i2=127;

        Integer i3=new Integer(127);
        Integer i4=new Integer(127);

        System.out.println(i1==i2);
        System.out.println(i3.equals(i4));
    }

}
