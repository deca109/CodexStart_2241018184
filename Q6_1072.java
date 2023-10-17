/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1072
 */
import java.util.Scanner;
public class Q6_1072 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(combinations(i));
		}
	}
	static long combinations(int n) {
		long x=n*n;
		long tot=x*(x-1);
		tot=tot/2;
		long invalid=4*(n-1)*(n-2);
		long valid=tot-invalid;
		return valid;
	}
}
