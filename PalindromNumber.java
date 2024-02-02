package Practice1;

public class PalindromNumber {
	public static void main(String[] args) {
		int number=202;
		int rev=0;
		int i=number;
		
		while(number!=0) {
			int remender=number%10;
			rev=rev*10+remender;
			number=number/10;
		}
		if(i==rev) {
			System.out.println("Given Number Palindrom");
		}
		else {
			System.out.println("Given Number Not Palindrom");
		}
	}
}
