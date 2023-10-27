package assignment_1;
import java.util.*;

public class Pattern_double_sided_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// for n = 7
		int row = 1;
		int nsp1 = n-1;
		int nsp2 = -1;
		int nst = 1;
		int val= 1;
		while(row<=n) {
			int i = 1;
			while(i<=nsp1) {
				System.out.print("  ");
				i++;
			}
			int p = val;
			int j = 1;
			while(j<=nst) {
				System.out.print(p+" ");
				p--;
				j++;
			}
			int k = 1;
			while(k<=nsp2) {
				System.out.print("  ");
				k++;
			}
			 j = 1;
			 p++;
			if(row==1 || row==n) {
				j = 2;
			}
			while(j<=nst) {
				System.out.print(p+" ");
				p++;
				j++;
			}
			if(row<n/2+1) {
				nsp1 -=2;
				nsp2 +=2;
				nst++;
				val++;
				
			}
			else {
				nsp1 +=2;
				nsp2 -= 2;
				nst--;
				val--;
			}
			row++;
			System.out.println();
		}
		

	}

}
