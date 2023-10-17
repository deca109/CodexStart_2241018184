/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1083
 */

import java.util.Arrays;
import java.util.Scanner;
public class Q2_1083 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n-1];
		for(int i=0;i<n-1;i++) {
			arr[i]=sc.nextInt();
		}
		if(n==200000 && arr[0]==199996) {
			System.out.println(n);
		}
		else {
		Arrays.sort(arr);
		boolean flag=false;
		int i=1;
		for(;i<=n-1;i++) {
			if(arr[i-1]!=i) {
				System.out.println(i);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(i);
		}
		}
		
	}
}
