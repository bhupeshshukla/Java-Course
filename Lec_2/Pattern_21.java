package Lec_2;
import java.util.*;

public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 2*n-3;
		int star = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//task for space
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			// task for star
			int k =  1;
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			// prep for next row
			row++;
			System.out.println();
			star++;
			space -=2;
		}
		
		
		

	}

}
