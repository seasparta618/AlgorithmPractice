package niuke.algorithm.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * this question is from HDU 200
 * 
 * find the Narcissistic number in the given range
 * 
 * input 
 * 100 120
 * output
 * no
 * input 
 * 300 500
 * output
 * 370 371
 * 
 * @author Sparta
 *
 * solved 2018 Mar 09
 *
 */

public class NarcissisticNumber {
	
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int min = sc.nextInt();
			int max = sc.nextInt();
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			for(; min < max ; min++){
				int hun = min/100;
				int del = min%100/10;
				int dig = min%10;
				int total = (int) (Math.pow(hun, 3)+Math.pow(del,3)+Math.pow(dig,3));
				if(total == min){
					numberList.add(min);
				}
			}
			if(numberList.size()==0){
				System.out.println("no");
			}else{
				for(int number : numberList){
					System.out.print(number);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
