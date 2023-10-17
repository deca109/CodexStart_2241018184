/*
 * Name: Debopriyo Roy
 * Reg No: 2241018184
 * PS LINK: https://cses.fi/problemset/task/1092
 */
import java.util.*;
public class Q7_1092 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%4==1||n%4==2) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
			ArrayList<Integer> set1=new ArrayList<>();
			ArrayList<Integer> set2=new ArrayList<>();
			if(n%2==0) {
				int count=n/4;
				int i=0;
				for(;i<count;i++) {
					set1.add(i+1);
					set1.add(n-i);
				}
				for(i=i+1;i<=n-count;i++) {
					set2.add(i);
				}
			}
			else {
				if(n==3) {
					set1.add(3);
					set2.add(1);
					set2.add(2);
				}
				else {
					int count=(n+1)/4;
					int i=0;
					for(;i<count-1;i++) {
						set1.add(i+1);
						set1.add(n-i);
					}
					
					if(!set1.isEmpty())
					set1.add(set1.get(set1.size()-1)-1);
					
					for(i=i+1;i<=n-count;i++) {
						set2.add(i);
					}
				}
			}
			 System.out.println(set1.size());
	            
			 StringBuilder str1 = new StringBuilder();
	         StringBuilder str2 = new StringBuilder();
	            
	         for (int i=0;i<set1.size();i++) {
	           str1.append(set1.get(i)).append(" ");
	         }  
	         System.out.println(str1.toString());
	            
	         System.out.println(set2.size());
	         for (int i=0;i<set2.size();i++) {
	            str2.append(set2.get(i)).append(" ");
	         }  
	         System.out.println(str2.toString());
		}
	}
}
