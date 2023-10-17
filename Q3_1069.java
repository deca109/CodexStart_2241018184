/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1069
 */

import java.util.*;
public class Q3_1069 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int rep=1,maxrep=1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				rep++;
			}
			else {
				rep=1;
			}
			maxrep=Math.max(rep, maxrep);
		}
		System.out.println(maxrep);
	}
}
