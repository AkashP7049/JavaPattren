package FrameWork;
import java.util.*;
public class ExampleArraYList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		Iterator <Integer>itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
      System.out.println(al.size());
      for(int i=0;i<al.size();i++) {
    	  System.out.println(al.get(i));
      }
      
	}

}
