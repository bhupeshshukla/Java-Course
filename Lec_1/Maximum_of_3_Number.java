package Lec_1;

public class Maximum_of_3_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		int b = 3;
		int c = 5;
		if (a >= b && a >= c) {
			System.out.println(a);
		}

		else if (b >= a && b >= c) {
			System.out.println(b);
		} else {

			System.out.println(c);
		}
	}

}
