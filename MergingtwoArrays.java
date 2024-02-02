package Practice1;

import java.util.Arrays;

public class MergingtwoArrays {
	public static void main(String[] args) {
		int[] a= {45,65,89,21};
		int[] b= {154,63,547,956};
		int count=0;
		
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[count]=a[i];
			count++;
		}
		for(int i=0;i<b.length;i++) {
			c[count]=b[i];
			count++;
		}
		System.out.println(Arrays.toString(c));
	}

}
