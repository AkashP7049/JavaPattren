package FrameWork;

import java.util.LinkedHashSet;

public class LinkedhashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
	        
	        int [] arr = {1,2,7,9,1,3,2,5};
	        for(int i :arr) {
	        	hs.add(i);
	        }
	        System.out.println(hs);
		}

	}

