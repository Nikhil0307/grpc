package org.main.master;

import java.util.HashMap;

public class MetaData {
    static HashMap<String,Long> metaDataForSlave = new HashMap<>(); //IP with port , CacheStorage space
    static HashMap<String, HashMap<Integer,String>> metaDataForFile = new HashMap<>();  //name , Map<order num, IP with port>

    static HashMap<String,Long> GETNode(){
        int i ;
        for ( i = 0; i < metaDataForSlave.size(); i++) {
            if (metaDataForSlave.get(i)>30000000){
              break;
            }
        }
        HashMap<String,Long> temp = new HashMap<>();
        temp.put((String) metaDataForSlave.keySet().toArray()[i], metaDataForSlave.get(i));
        return temp;
    }

    static void PUTSlave(String IP,Long space){
        metaDataForSlave.put(IP, space);
    }
    static Long GetSlaveSpace(String IP){
        return metaDataForSlave.get(IP);
    }


    static void PUTFile(String name,Integer orderNum,String IP){
        if(metaDataForFile.containsKey(name)){
            metaDataForFile.get(name).put(orderNum,IP);
        }else {
            HashMap<Integer,String> tempHashMap = new HashMap<>();
            tempHashMap.put(orderNum,IP);
            metaDataForFile.put(name,tempHashMap);
        }
    }
    static HashMap<Integer,String> GETFile(String name){
        if (!metaDataForFile.containsKey(name))return null;
        return metaDataForFile.get(name);
    }
    
}
