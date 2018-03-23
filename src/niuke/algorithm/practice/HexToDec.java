package niuke.algorithm.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * this problem is from University of NSW code practice
 * 
 * input a hex number like 0xA
 * 
 * output 10
 * 
 * @author Sparta
 * 
 *         solved 24 Mar 2018
 */
public class HexToDec {

	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String hexNumber = sc.nextLine();
			hexNumber = hexNumber.toUpperCase();
			char[] charArray = hexNumber.toCharArray();
			char[] digArray = Arrays.copyOfRange(charArray, 2, charArray.length);
			int decNumber = 0;
			int index = 0;
			for (char dig : digArray) {
				int number16 = (int) Math.pow(16, (digArray.length - 1 - index));
				if (Character.isDigit(dig)) {
					decNumber += (dig - 48) * number16;
				} else {
					decNumber += (dig - 55) * number16;
				}
				index++;
			}
			System.out.println(decNumber);
		}
	}
}
