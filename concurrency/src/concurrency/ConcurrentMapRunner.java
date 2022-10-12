package concurrency;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		
		
		        int[][] a = new int[10][10];
		        for(int i = 0; i<10; i++){
		            for(int j = 0; j<10; j++){
		            	
		            	System.out.print(a[i][j]); 
		            }
		            System.out.println(i); 
		        }

//		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
//		 String str = "Keyuri I love you";
//		 for (char character:str.toCharArray()) {
//			 occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
//		 }
//		
//		System.out.println(occurances);

}

}

/*
 * HashMap<Character, LongAdder> occurrences = new HashMap<>(); String str =
 * "Keyuri I love you"; for (char character:str.toCharArray()) { LongAdder
 * longAdder = occurances.get(character); if(longAdder == null) { longAdder =
 * new LongAdder(); } longAdder.increment();
 * occurances.put(character,longAdder); } System.out.println(Occurrences); }
 */