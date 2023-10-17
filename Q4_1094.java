/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1094
 */

import java.util.*;
public class Q4_1094 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		long op=0;
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				op=op+arr[i-1]-arr[i];
				arr[i]=arr[i-1];
			}
		}
		System.out.println(op);
	}
}
