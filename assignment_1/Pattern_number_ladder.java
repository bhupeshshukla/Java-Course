package assignment_1;
import java.util.*;

public class Pattern_number_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				// for n = 4
		int row = 1;
		int star = 1;
		int val = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print(val+"\t ");
				i++;
				val++;
			}
			row++;
			star++;
			System.out.println();
			
		}

	}

}
