package niuke.algorithm.practice;
import java.util.List;
import java.util.*;

/*在情报传递过程中，为了防止情报被截获，往往需要对情报用一定的方式加密，简单的加密算法虽然不足以完全避免情报被破译，
 * 但仍然能防止情报被轻易的识别。我们给出一种最简的的加密方法，
 * 对给定的一个字符串，把其中从a-y,A-Y的字母用其后继字母替代，把z和Z用a和A替代，则可得到一个简单的加密字符串。 
 * 
 * In the process of intelligence transfer, in order to prevent intelligence from being intercepted, 
 * it is often necessary to encrypt information in a certain way. 
 * Although simple encryption algorithms are not sufficient to completely avoid information from being deciphered,
 * But still can prevent intelligence from being easily identified. We give a simplest encryption method,
 * For a given string, replace the letter from a-y, A-Y with its successor letter, replace z and Z with a and A, 
 * and get a simple encrypted string.
 * 
 * input sample "Hello World Yihang Wang!!!"
 * output sample ""Ifmmp Xpsme Zjiboh Xboh!!!"
 * 
 * Thinking, just seperate all the chars in the string into an array
 * state whether the char is the letter
 * if the char is a letter, transfer it to char+1 or char-26
 * 
 * solved 2018-2-27
 */

public class StringEncription {

	public static void main(String[] ar) {
		String str;
		Scanner sc=new Scanner(System.in);
		str = sc.nextLine();
		StringEncription m1 = new StringEncription();
		System.out.println(m1.encryptMethod(str));

	}

	public String encryptMethod(String str) {
		char[] a = str.toCharArray();
		String newStr = "";
		for (char c : a) {
			if (Character.isLetter(c)) {
				if (c == 90 || c == 122) {
					c -= 26;
				}else{
					c++;
				}
			}
			newStr = newStr + c;
		}
		return newStr;
	}
}
