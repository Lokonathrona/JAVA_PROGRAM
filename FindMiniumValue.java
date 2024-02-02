package ProgramDAY6;

public class FindMiniumValue {
	public static void main(String[] args) {
		int[] a= {4,5,6,2,1,8,9,7,0};
		int min=a[0];
		for(int i=1;i<a.length;i++) 
		{
			if(min>a[i]) 
			{
				min=a[i];
			}
		}
		System.out.println("Minium element i::"+min);
	}

}
