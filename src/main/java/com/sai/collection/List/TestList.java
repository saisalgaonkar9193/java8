package com.sai.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("sai" );

        List clone = (ArrayList)list.clone();


        System.out.println(list==clone);
        System.out.println(list.get(0)==clone.get(0));

//        list.get(1);
        LinkedList linkedList=new LinkedList();

//        linkedList.get(1);
    }
}
