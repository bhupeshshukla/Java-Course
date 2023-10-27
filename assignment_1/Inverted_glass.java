package assignment_1;
import java.util.Scanner;
public class Inverted_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//  for n = 5
		int row = 1;
		int nst = 1;
		int nsp = 2*n -1;
		while(row<=2*n + 1){
			int B = n;
			int i = 1;
			while(i<=nst) {
				System.out.print(B+" ");
				i++;
				B--;
			}
			int j=1;
			while(j<=nsp) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if(row==n+1) {
				k=2;
				B++;
			}
			while(k<=nst) {
				System.out.print(++B+" ");
				k++;
			}
			if(row>n) {
				nst--;
				nsp += 2;
			}
				else {
					nst++;
					nsp -= 2;
				}
			row++;
			System.out.println();
				}
					
				}
			}
