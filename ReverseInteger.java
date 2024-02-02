package Practice1;

public class ReverseInteger {
	public static void main(String[] args) {
		int number=654321;
		int rev=0;
		
		while(number!=0) {
			int remender=number%10;
			rev=rev*10+remender;
			number=number/10;
		}
		System.out.println("Reverse Integer::"+rev);
	}

}
