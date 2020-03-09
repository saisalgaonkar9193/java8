package com.sai.stream;

import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {
        Stream<String> str1 = Stream.of("Hi", "12");
        Stream<Integer> str2 = Stream.of(45, 12);

        Stream<String> str3 = Stream.<String>builder().add("sai").add("Ream").build();

        Stream<Integer> str4 = Stream.iterate(0, i -> {
            return i + 1;
        })
                .limit(20)
                ;
        System.out.println("Done");
        System.out.println(str4.count());



    }
}
