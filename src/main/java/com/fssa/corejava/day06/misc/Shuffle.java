package com.fssa.corejava.day06.misc;

import java.util.*;
public class Shuffle {
//	Shuffle
    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    
    
//   frequency
    Collection<String> list1 = new ArrayList<>();
    list1.add("cse");
    list1.add("cse");
    list1.add("eee");
    int cnt = Collections.frequency(list1, "cse");
    System.out.println(cnt);
    }
}
