package Practice1;

import java.util.Arrays;

public class PrintArray {
	public static void main(String[] args) {
		int[] number= {45,65,89,189,94};
		
		for(int i=0;i<number.length;i++) {
			System.out.println(i);
			System.out.println(number[i]);
		}
		
		System.out.println(Arrays.toString(number));
	}

}
