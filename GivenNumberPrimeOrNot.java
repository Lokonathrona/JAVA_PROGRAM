package Practice1;

public class GivenNumberPrimeOrNot {
	public static void main(String[] args) {
		int no=8;
		int count=0;
		
		for(int i=2;i<no-1;i++) {
			if(no%i==0) {
				count++;
			}
		}
			if(count==0) {
				System.out.println("Given No Prime");
			}
			else {
				System.out.println("Given Number Not Prime");
			}
		}
}
