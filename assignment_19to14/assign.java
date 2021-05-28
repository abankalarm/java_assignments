import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class assign {

    static Map<String, Integer> map = new HashMap<>();
    public static void sortbykey()
    {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
 
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());       
    }
     
   
    public static void main(String args[])
    {
        // putting values in the Map
        map.put("java", 80);
        map.put("assignment", 90);
        map.put("by", 80);
        map.put("karan", 75);
        map.put("bamal", 40);
        
        System.out.println('\n');

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey().toString();
            Integer value = entry.getValue();
            System.out.println("key, " + key + " value " + value);
        }
        System.out.println('\n');
        // Calling the function to sortbyKey
        sortbykey();

        System.out.println('\n');

        //LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();

        LinkedHashMap linkedMapObj = new LinkedHashMap(map);
        System.out.println("Key-Value pairs: "+map.entrySet());  
    }
}