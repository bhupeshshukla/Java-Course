package assignment_1;
import java.util.*;

public class fibnocci_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// for n = 4
        int row=1;
        int star=1;
        int a=0;
        int b=1;
        while(row<=n) {
        	int i = 1;
        	while(i<=star) {
        		if(row==1) {
        			System.out.print(a+"\t");
        		}
        		else if(row==2) {
        			System.out.print(b+"\t");
        		}
        		else {
        			int c = a+b;
        			a=b;
        			b=c;
        			System.out.print(a+b+"\t");
        		}
        		i++;
        	}
        	row++;
        	star++;
        	System.out.println();
        }
	}
}