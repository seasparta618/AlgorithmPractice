package niuke.algorithm.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This question is from LeetCode
 * 
 * Given a string s and a dictionary of words dict, determine if s can be
 * segmented into a space-separated sequence of one or more dictionary words.
 * 
 * For example, given s ="leetcode", dict =["leet", "code"].
 * 
 * Return true because"leetcode"can be segmented as"leet code".
 * 
 * @author Sparta
 *
 */
public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict){
		int length = s.length();
		boolean[] result = new boolean[length+1];
		result[0] = true;
		for(int i = 0 ; i <= length ; i++){
			for(int j = 0 ; j < i ; j++){
				if(result[j]&&dict.contains(s.substring(j,i))){
					result[i] = true;
				}
			}
		}
		return result[length];
	}
	
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String dict = sc.nextLine();
		String[] dicts = dict.split(" ");
		Set<String> dictSet = new HashSet<String>();
		for(String word : dicts){
			dictSet.add(word);
		}
		WordBreak wb = new WordBreak();
		System.out.println(wb.wordBreak(str, dictSet));
	}
}
