package niuke.algorithm.practice;

import java.util.Scanner;

/**
 * this question is from Huawei Technical Interview
 * 
 * assume that you have x bottles of water, every 3 empty bottles could exchange
 * for 1 bottle of water
 * 
 * after drinking, if the new empty bottle plus the old empty bottle is no smaller than 3
 * you could get a new bottle of water
 * 
 * if you have 2 bottles left, you could borrow 1 bottle of water
 * then return the 2 old bottles and 1 new bottle
 * then you do no get a new bottle of water 
 * as you own 1 bottle
 * 
 * so the case could be 
 * 10/3 = 3, 10-9 = 1, now you drink 3
 * 1+3 = 4, 4/3 = 1, 4 - 3 = 1, now you drike 1 and you will have 2 empty bottle
 * you borrow 1 because you have 2
 * then 2+1 = 3, you drink and return the owned 1
 * calculate how many bottle of waters can we totally ger based on the input
 * number
 * 
 * @author Sparta
 *
 */
public class EmptyBottle {

	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int bottleNumber = Integer.parseInt(sc.nextLine());
			int total = 0;
			countBottle(bottleNumber, 0);
		}
	}

	public static void countBottle(int bottleNumber, int total) {
		int count = bottleNumber / 3;
		bottleNumber = bottleNumber - count * 3;
		bottleNumber = bottleNumber + count;
		total = total + count;
		if (bottleNumber == 2) {
			bottleNumber++;
		}
		if (bottleNumber >= 3) {
			countBottle(bottleNumber, total);
		} else {
			System.out.println(total);
		}

	}
}
