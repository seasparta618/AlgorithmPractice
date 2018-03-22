package niuke.algorithm.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * suppose there are n numbers and we want to connect the numbers into a large number
 * now we want the number to be the largest
 * there are two inputs
 * first row is the number of the number, then the second row is the number
 * e.g
 * 2 /n 123 23 => 23123
 * 3 /n 7 96 222 48 => 96748222
 *
 * @author Sparta
 *
 * required running time is less than 1s, required memary taken is less than 32768K
 * My result is 38ms and 10724K
 * 
 * solved 2018-Mar-01
 */
public class FindTheLargestNumber {

	public static void main(String[] ar){
		int n;
		String str;
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		str = sc.nextLine().toString();
		ArrayList<String> numberList = new ArrayList<String>();
		String[] strs = str.split(" ");
		for(String s : strs){
			numberList.add(s);
		}
		Collections.sort(numberList, new Comparator<String>(){
			public int compare(String str1, String str2){
				//this is the core part of this question I think.
				return (str2+str1).compareTo(str1 + str2);
			}
		});
		for(String s : numberList){
			System.out.print(s);
		}
		
	}
}
