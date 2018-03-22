package niuke.algorithm.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * assume that there is a sequence "abc", the Subsequence of this sequence could be
 * { null, a, b, c, ab, ac, bc, abc} 
 * if second input is the subsequence of the first input, output "Yes"
 * else output "No"
 * @author Sparta
 *
 * solved 2018 Mar 19
 */

public class SubsequenceProblem {

	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		int count1 = 0 ; int count2 = 0;
		boolean result = false;
		
		while(count2 < s2.length && count1 < s1.length){
			if(s1[count1] == s2[count2]){
				count1++;
				count2++;
			}else{
				count1++;
			}
		}
		if(count2 == s2.length){
			result = true;
		}
		System.out.println(result?"Yes":"No");
		
	}
}
