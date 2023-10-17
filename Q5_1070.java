/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1070
 */
import java.util.*;
public class Q5_1070 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			System.out.print(1);
		}
		else if(n<4) {
			System.out.println("NO SOLUTION");
		}
		else {
			int c=2;
			StringBuilder str=new StringBuilder();
			for(int i=0;i<n/2;i++) {
				str.append(c).append(" ");
				c+=2;
			}
			c=1;
			for(int j=n/2;j<n;j++) {
				str.append(c).append(" ");
				c+=2;
			}
			System.out.println(str.toString());
		}
	}
}
