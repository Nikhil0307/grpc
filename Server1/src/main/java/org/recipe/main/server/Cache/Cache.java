package org.recipe.main.server.Cache;

import java.util.*;

public class Cache {
    public static Map<String, Object> cache = new HashMap<>();

    public static String SetRecipe(String recipe , String process){
        cache.put(recipe,process);
        return "added to cache";
    }
    public static String GetProcess(String recipe){
        return (String) cache.get(recipe);
    }
}
