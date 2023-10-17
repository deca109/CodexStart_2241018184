/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1617
 */
import java.util.*;
public class Q8_1617 {
	public static void main(String args[]) {
		int mod=1000000007;
		Scanner sc=new Scanner(System.in);
		long exp=sc.nextInt();
		long base=2;
		long res=1;
		while(exp>0) {
			if(exp%2!=0) {
				res=((res%mod)*(base%mod))%mod;
			}
			base=((base%mod)*(base%mod))%mod;
			exp/=2;
		}
		System.out.println(res);
	}
}
