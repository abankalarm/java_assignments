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
 
        // Calling the function to sortbyKey
        sortbykey();
    }
}