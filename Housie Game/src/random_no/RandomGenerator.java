package random_no;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomGenerator {
	
	
	public int randomNo() {
		
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	for(int i=0;i<10;i++) {
		
		al.add(i+1);
		
	}
	Collections.shuffle(al);
	System.out.println(al);
	return 0;
	}
	
	public static void main(String[] args) {
		
		RandomGenerator rg = new RandomGenerator();
		rg.randomNo();
	}
	
}

	
		
