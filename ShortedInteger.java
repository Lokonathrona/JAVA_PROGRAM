package Practice;

import java.util.Arrays;

public class ShortedInteger {
	public static void main(String[] args) {
		int[] number= {60,40,10,30,50,20};
		
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]>number[j]) {
					int temp=number[i];
					
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(number));
	}

}
