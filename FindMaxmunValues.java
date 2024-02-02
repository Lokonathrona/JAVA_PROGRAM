package ProgramDAY6;

public class FindMaxmunValues {
	public static void main(String[] args) {
		int[] a= {4,5,6,2,1,8,9,7};
		
		int max=a[0];
		for(int i=1;i<a.length;i++) 
		{
			if(max<a[i]) 
			{
				max=a[i];
			}
		}
		System.out.println("maximum element is::"+max);
		
	}

}
