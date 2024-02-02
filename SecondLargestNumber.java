package ProgramDAY4;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] a= {25,6,35,26,95,24,6,7,2,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//checking Array
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Second Largest Number::"+a[1]);
	}

}
