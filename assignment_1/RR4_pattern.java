package assignment_1;
import java.util.*;

public class RR4_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// for n = 3
		int row = 1;
		int star = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			// prep for next row
			row++;
			star++;
			System.out.println();
		}

	}

}
