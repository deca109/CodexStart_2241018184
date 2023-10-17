/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1618
 */
import java.util.*;
public class Q9_1618 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int c=5;
		while(c<=1000000000) {
			list.add(c);
			c*=5;
		}
		int ans=0;
		for(Integer i:list) {
			ans+=n/i;
		}
		System.out.println(ans);
	}
}
