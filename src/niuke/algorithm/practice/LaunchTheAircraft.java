package niuke.algorithm.practice;

import java.util.Scanner;

/**
 * suppose that we need to launch a aircraft
 * in the launching process, if the damage is x,
 * in the return process, the damage will be x^2
 * now assume that before launching, the maximum rest damage is h
 * if x+x^2 >= h, the aircraft will fall
 * in order to make sure tha aircraft is safe, what is the maximum damange could be in each launching
 * 
 * say the aircraft rest damage limitation is h
 * please find what is the maximum damage during the launching process (just consider the maximum integer)
 * h should be 1 <= h <= 10^18
 * input example 10
 * the maximum damage during launching process is 2
 * 
 * @author Sparta
 *	
 * Requested time is less than 1m, memory less than 32768K
 * 
 * My result is 31ms, 10716K
 * solved 2018 Mar 13
 */
public class LaunchTheAircraft{
	
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		long restDamage = Long.parseLong(sc.nextLine());
		long damage =  (long) Math.pow(restDamage, 0.5);
		
		if(damage * (damage + 1) > restDamage){
			System.out.println(damage-1);
		}else{
			System.out.println(damage);
		}
	}
}
