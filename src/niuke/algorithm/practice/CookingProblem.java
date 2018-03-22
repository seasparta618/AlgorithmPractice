package niuke.algorithm.practice;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Now suppose that we need to cook several items
 * 
 * item 1 requests: BUTTER FLOWER
 * item 2 requests: BUTTER FLOUR EGG HONEY
 * 
 * now we finish our input and calculate how many kind of materials we need
 * 
 * the outpur for this question is 4
 * 
 * @author Sparta
 * 
 * required time is less than 1s, less than 32768K
 * 
 * my result is 36ms, 10454K
 *
 */

public class CookingProblem {

	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		HashSet<String> hSet = new HashSet<String>();
		while(sc.hasNext()){
			hSet.add(sc.next());
		}
		
		int number = hSet.size();
		System.out.println(number);
		
		
		
	}
}
