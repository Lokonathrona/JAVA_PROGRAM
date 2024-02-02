package Practice1;
public class MissingIntegerInArray {
	public static void main(String[] args) {
		int[] number= {1,2,3,4,5,6,7,9};
		int sum1=0;
		
		for(int i=0;i<number.length;i++) {
			sum1=sum1+number[i];
		}
		int sum2=0;
		for(int j=0;j<10;j++) {
			sum2=sum2+j;
		}
		System.out.println("Missing number in Array::"+(sum2-sum1));
	}
}
