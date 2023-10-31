package Lec_2;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize for first row
		int n = 5;
		int row = 1;
		int space = n-1;
		int star = 1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			// task for star
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			space--;
			star++;
			System.out.println();
		}

	}

}
