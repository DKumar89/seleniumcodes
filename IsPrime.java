package weekly.day1;

public class IsPrime {
	
	public static void main(String[] args) {
		
		int n = 19;	
		int flag = 0;
		
		
		for (int i = 2; i <=n; i++){
			if (n%i ==0) {
				System.out.println("Number is not prime");
				flag =1;
				break;
				
			}
		}
		if (flag==0) {
		System.out.println("Number is prime");

	}
	}

}
