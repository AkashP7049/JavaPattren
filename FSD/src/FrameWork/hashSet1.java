package FrameWork;

import java.util.HashSet;

public class hashSet1 {

	public static void main(String[] args) {
	
        HashSet<Integer> hs = new HashSet<Integer>();
        
        int [] arr = {1,2,1,3,2,5};
        for(int i :arr) {
        	hs.add(i);
        }
        System.out.println(hs);
	}

}
