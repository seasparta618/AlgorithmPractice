package niuke.algorithm.practice;
import java.util.List;
import java.util.*;

/*���鱨���ݹ����У�Ϊ�˷�ֹ�鱨���ػ�������Ҫ���鱨��һ���ķ�ʽ���ܣ��򵥵ļ����㷨��Ȼ��������ȫ�����鱨�����룬
 * ����Ȼ�ܷ�ֹ�鱨�����׵�ʶ�����Ǹ���һ�����ĵļ��ܷ�����
 * �Ը�����һ���ַ����������д�a-y,A-Y����ĸ��������ĸ�������z��Z��a��A�������ɵõ�һ���򵥵ļ����ַ����� 
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
