/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1754
 */
import java.util.*;
import java.io.*;
public class Q10_1754 {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			String str=br.readLine();
			String nums[]=str.split(" ");
			int a=Integer.parseInt(nums[0]);
			int b=Integer.parseInt(nums[1]);
			if(b<=2*a && a<=2*b && (a+b)%3==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
