package weekly.day1;

import java.util.Iterator;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input =11;
		int sum=0;
		int firstnumber=0,secondnumber=1;
		System.out.println(firstnumber + "\n" + secondnumber);
		for (int i = 2; i < input; i++) {
			sum=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=sum;
			System.out.println(sum);
		}
	}

}
