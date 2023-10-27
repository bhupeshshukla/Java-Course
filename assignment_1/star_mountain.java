package assignment_1;
import java.util.*;
public class star_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// for n = 5
		int row = 1;
		int star= 1;
		int space = n/2;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<(n/2)+1){
				space--;
				star +=2;
			}
			else {
				space++;
				star -=2;
			}
			row++;
			System.out.println();
		}

	}
	}
