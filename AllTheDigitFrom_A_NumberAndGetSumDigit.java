package ProgramDAY5;

public class AllTheDigitFrom_A_NumberAndGetSumDigit {
	public static void main(String[] args) {
		int number=1051;
		int count=0;
		
		while(number>0) {
			int remender=number%10;
			count=count+remender;
			number=number/10;
		}
		System.out.println(count);
	}
	

}
