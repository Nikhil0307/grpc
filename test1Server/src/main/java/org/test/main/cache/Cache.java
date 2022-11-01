package org.test.main.cache;

import com.google.protobuf.ByteString;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    public static Map<Integer, ByteString> cache = new HashMap<>();

    public static void hsAddObject(Integer key , ByteString val ){
        cache.put(key, val);
    }
    public static ByteString hsGetObject(Integer key){
        return cache.get(key);
    }
}
