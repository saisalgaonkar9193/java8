package com.sai.collection;

import lombok.Data;

import java.util.*;

@Data
public class TestSet {

    private String value;

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestSet testSet = (TestSet) o;
        return Objects.equals(value, testSet.value);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode");
        return Objects.hash(value);
    }

    public static void main(String[] args) {



        TestSet t=new TestSet();
        t.value="sai";
        TestSet t1=new TestSet();
        t1.value="sai1";

        Set<TestSet> hs=new HashSet<>();
        Set<TestSet> lhs=new LinkedHashSet<>();
        Set<TestSet> ts=new TreeSet<TestSet>(Comparator.comparingInt(prev -> prev.value.hashCode()));

        hs.add(t);
        lhs.add(t);
        ts.add(t);

        hs.add(t);
        lhs.add(t);
        ts.add(t);

        hs.add(t1);
        lhs.add(t1);
        ts.add(t1);

        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);

    }

}