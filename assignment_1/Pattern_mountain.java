package assignment_1;
import java.util.*;

public class Pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// for n = 4
        int row=1;
        int star=1;
        int space=n+1;
        int val = 1;
        while(row<=n) {
        	int p = val;
        	int i=1;
        	while(i<=star) {
        		System.out.print(p+" ");
        		i++;
        		p++;
        	}
        	int j=1;
        	while(j<=space) {
        		System.out.print("  ");
        		j++;
        	}
        	
        	int k=1;
        	if(row==n) {
        		k=2;
        		p--;
        	}
        	while(k<=star) {
        		System.out.print(--p+" ");
        		k++;
        	}
        	row++;
        	star++;
        	space-=2;
        	System.out.println();
			
		}
			}

	}

