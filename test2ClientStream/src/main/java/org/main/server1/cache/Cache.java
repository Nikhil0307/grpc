package org.main.server1.cache;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class Cache {
    public static HashMap<String, byte []> cache =  new HashMap<>();

    public static void setCache(String k , byte[] v) throws IOException {
        if (!cache.containsKey(k)){
            System.out.println("NO");
            cache.put(k,v);
            return;
        }
        System.out.println("YESS");
        byte[] temp = cache.get(k);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(temp);
        outputStream.write(v);
        cache.put(k,outputStream.toByteArray());
        System.out.println(cache.get(k).length + " -> From cache");
    }

    public static byte[] getCache(String k) {
        return cache.get(k);
    }
}
