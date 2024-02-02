package Practice1;

public class CountDigit {
	public static void main(String[] args) {
	
		int n=987652368;
		int count=0;
		
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
	
	}
}
