package Lec_2;
import java.util.*;

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1;
		int star=n;
		int space=n-1;
		while(row<=2*n-1) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			// mirroring of the pattern 
			if(row<n) {
				space--;
				star--;
			}
			else {
				space++;
				star++;
			}
			// prep for next row 
			row++;
			System.out.println();
		}

	}

}
