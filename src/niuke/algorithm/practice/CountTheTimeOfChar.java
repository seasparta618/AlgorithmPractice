package niuke.algorithm.practice;

import java.util.Scanner;

/**
 * practice from Huawei Company Technical Interview
 * 
 * input a string AABBCDCDSSHHHH 
 * input a char A
 * 
 * output 2
 * 
 * the last char is the target char
 * 
 * output how many times is the last char in the string
 * 
 * @author Sparta
 *
 */
public class CountTheTimeOfChar{

	
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		String targetStr = sc.nextLine();
		char[] targetChars = targetStr.toCharArray();
		char targetChar = targetChars[targetChars.length-1];
		char[] charArray = str.toCharArray();
		int count = 0;
		for(int index = 0 ; index < charArray.length-1 ; index++){
			if(charArray[index] == targetChar){
				count++;
			}
		}
		System.out.println(count);
	}
}
