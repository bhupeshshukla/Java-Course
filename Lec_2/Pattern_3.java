package Lec_2;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int row = 1;
		int star = n;
		while(row<=n) {
			// task star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			// prep for next row
			row++;
			star--;
			System.out.println();
		}

	}

}
