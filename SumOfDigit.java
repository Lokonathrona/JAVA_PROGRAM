package Practice1;

public class SumOfDigit {
	public static void main(String[] args) {
		int number=98745;
		int sum=0;
		
		while(number!=0) {
			int remender=number%10;
			sum=sum+remender;
			number=number/10;
		}
		System.out.println(sum);
	}

}
