package assignment_1;
import java.util.*;
public class Pattern_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		// for n = 4
		int star = 1;
		int space = n - 1;
		int row = 1;
	

		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			int val=row;
			while (j <= star) {
				System.out.print(val + "\t");
				if(j<star/2+1) {
					val++;
				}
				else {
					val--;
				}
				j++;
				
			}
			//
			star+=2;
			row++;
			space--;
System.out.println();
}
	}
}
