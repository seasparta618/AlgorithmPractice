package niuke.algorithm.practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * now suppose that we have n cows, n cows has different(may be same) numbers of
 * apple what we want is to move the apples between the cows and everytime you
 * must move to
 * 
 * suppose 2 cows, own 5 and 9 apples we need to move 1 times (2 apples per
 * time) suppose we have 4 cows, own 5 9 11 3 apples we need to move 3 times (2
 * apples per time)
 * 
 * input the first line input a number of the cows second line input how many
 * apples each cow owns
 * 
 * then output the times we need to move
 * 
 * @author Sparta
 * 
 * requested time less than 1s, memory 
 * My result is 71ms 9876ms
 * 
 * solved 2018 Mar 16
 */

public class AverageProblem {

	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int total = Integer.parseInt(sc.nextLine());
		String numbers = sc.nextLine();
		String[] numberStrs = numbers.split(" ");
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		int totalValue = 0;
		int result = 0;
		for (String numberStr : numberStrs) {
			numberList.add(Integer.parseInt(numberStr));
			totalValue += Integer.parseInt(numberStr);
			
		}
		if (totalValue % total != 0) {
			System.out.println(-1);
		} else {
			int average = totalValue / total;
			
			for (int number : numberList) {
				if ((number & 1) != (average & 1)) {
					result = -1;
					break;
				}
				if(number > average){
					result += (number - average) / 2;
				}
			}
			System.out.println(result);
		}

	}
}
