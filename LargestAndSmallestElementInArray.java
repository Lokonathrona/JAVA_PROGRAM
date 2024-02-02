package Practice;

public class LargestAndSmallestElementInArray {
	public static void main(String[] args) {
		int[] number= {125,365,86,452,1597,23,4};
		
		int largest=number[0];
		int smallest=number[0];
		
		for(int i=0;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
			else if(number[i]<smallest) {
				smallest=number[i];
			}
		}
		System.out.println("Largest Element::"+largest);
		System.out.println("Smallest Element::"+smallest);
	}

}
