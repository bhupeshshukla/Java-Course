package assignment_1;
import java.util.*;

public class Hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		// for n = 5
		int row=1;
		int star= 2*n+1;
		int space= 0;
		int val = n;
		while(row<= 2*n+1) {
			int i =1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j= 1;
			int p = val;
			while(j<=star) {
				System.out.print(p+" ");
				if(j<=star/2) {
					p--;
				}
				else {
					p++;
				}
				j++;
			}
			if(row<n+1) {
				space++;
				star -=2 ;
				val--;
			}
			else {
				space--;
				star +=2;
				val++;
			}
			row++;
			System.out.println();
		}

	}

}
