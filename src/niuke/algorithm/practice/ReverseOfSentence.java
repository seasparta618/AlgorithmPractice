package niuke.algorithm.practice;

import java.util.Scanner;

/**
 * input a sentence, output all the words in the sentence in a reversed order
 * @author Sparta
 * 
 * solved 2018 Mar 23
 */
public class ReverseOfSentence {

	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] subStrs = input.split(" ");
		for(int index = subStrs.length ; index > 0 ; index --){
			System.out.print(subStrs[index-1]);
			if(index>1){
				System.out.print(" ");
			}
		}
	}
}
