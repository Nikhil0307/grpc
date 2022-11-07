package org.main.server1.cache;

import com.google.protobuf.ByteString;

import java.util.HashMap;
import java.util.Map;

public class CacheStorage {
    public static Map<String, ByteString> cache = new HashMap<>();

    public static void hsAddObject(String key , ByteString val ){
        if (cache.containsKey(key)){
            return;
        }
        cache.put(key, val);
    }
    public static ByteString hsGetObject(String key){
        if (!cache.containsKey(key))return null;
        return cache.get(key);
    }
}
