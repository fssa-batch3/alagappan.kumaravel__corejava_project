package com.fssa.corejava.day09.practice;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
	public static void main(String[] args) {
		int[] arr = {8, 9, 45, 12, 1};
		
		List a = Arrays.asList(arr);
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		
		al.add(8);
		al.add(2);
		al.add(45);
		al.add(12);
		al.add(1);
		Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
