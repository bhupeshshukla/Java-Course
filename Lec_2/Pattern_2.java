package Lec_2;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
			System.out.print("* ");
			i++;
			//prep for next row
	
			}
			row++;
			star++;
			System.out.println();
		}
				

	}

}
