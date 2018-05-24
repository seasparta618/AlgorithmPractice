package hackerrank.algorithm.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * 
 * @author Sparta
 * Input Format

The first line of the input consists of an integer . 
The next line contains  space-separated integers contained in the array.

Output Format

Print the integer sum of the elements in the array.

Constraints 
 1<= n <= 10;
 o <= arg[i] <= 10^10

Sample Input

5
1000000001 1000000002 1000000003 1000000004 1000000005
Output

5000000015
 */
public class LargeSum {
	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] args) {
		long sum = 0;
		for(long arg : args) {
			sum += arg;
		}
		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long[] ar = new long[arCount];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < arCount; i++) {
			long arItem = Long.parseLong(arItems[i]);
			ar[i] = arItem;
		}

		long result = aVeryBigSum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
