package Practice;

public class SumOfPrimeNumber1 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<=200;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0 && i!=1) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
