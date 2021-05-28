package com.company;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ques1 {

    public static HashMap<String,Long> cachedResults = new HashMap<String, Long >();

    public static Long getUniqueChars(String input) {

        Long ret=null;
        if(cachedResults.containsKey(input)) {

            ret = cachedResults.get(input);
            System.out.println("Access cache - "+ "String:"+input+" number:"+ret);
        }
        else {
            ret =input.chars().distinct().count();
            cachedResults.put(input, ret);
            System.out.println("Not in cache - "+ "String:"+input+" number:"+ret);
        }
        return ret;
    }

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("sadsaferf","CIAO","CIAO","sddsdsa","ER","sadsaferf","CIAO");
        strings.forEach(ques1::getUniqueChars);
    }

}