package Lec_4;

public class GCD_or_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 60;
		int divisor = 36;
		while( dividend%divisor != 0) {
			int reminder= dividend%divisor;
			dividend=divisor;
			divisor=reminder;
		}
		System.out.println(divisor);

	}

}
