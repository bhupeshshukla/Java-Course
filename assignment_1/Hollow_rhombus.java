package assignment_1;
import java.util.*;

public class Hollow_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// for n = 5
		int row = 1;
		int spaceout =n-1;
		int star= n;
		while(row<=n) {
			int i = 1;
			while(i<=spaceout) {
				System.out.print(" ");
				i++;
			}
			if(row==1 || row==n) {
				int j = 1;
				while(j<=star) {
					System.out.print("*");
					j++;
					}
			
			}else {
					System.out.print("*");
					
					int j =1;
					while(j<=n-2) {
						System.out.print(" ");
						j++;
					}
						
						System.out.print("* ");
					}
					//  prepration for next row 
					spaceout--;
					row++;
					System.out.println();
				}
			}
	}
	
					
					
					
					
					
		