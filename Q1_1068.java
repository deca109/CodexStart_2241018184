/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1068
 */

import java.util.Scanner;
public class Q1_1068 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		System.out.print(n+" ");
		while(true) {
			if(n%2==0) {
				n/=2;
			}
			else if(n==1) {
				break;
			}
			else if(n%2!=0) {
				n=(n*3)+1;
			}
			System.out.print(n+" ");
		}
	}
}
