package org.igorborba.java19;

import java.util.HashMap;
import java.util.Map;

public class NewHashMapExample {

    public static void main(String[] args){
        Map map1 = new HashMap(100); // Old way: 75% (load factor) was allocated resulting in 75 spaces in the memory

        Map map2 = HashMap.newHashMap(100); // todo: new hashmap: 100 spaces was allocated in the memory

    }
}
