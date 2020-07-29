package com.sai.collection;

import java.util.HashMap;

public class TestHashMap {

    public static void main(String[] args) {

        HashMap map=new HashMap();

        map.put(new Key("vrushali"), 22);
        map.put(new Key("vishal"), 20);
        map.put(new Key("vaibhav"), 40);
        map.put(new Key("sachin"), 30);

        System.out.println();
        System.out.println("Value for key sachin: " + map.get(new Key("sachin")));
        System.out.println("Value for key vaibhav: " + map.get(new Key("vaibhav")));
        System.out.println("Value for key vishal: " + map.get(new Key("vishal")));


    }
}

class Key {
    String key;
    Key(String key)
    {
        this.key = key;
    }

    @Override
    public int hashCode()
    {
        int hash = (int)key.charAt(0);
        System.out.println("hashCode for key: "
                + key + " = " + hash);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        System.out.println("Called Equals");
        return Character.valueOf(key.charAt(0)).equals(((Key)obj).key.charAt(0));

//        return key.equals(((Key)obj).key);
    }
}