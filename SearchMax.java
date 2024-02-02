package ProgramDAY4;

public class SearchMax {
	public static void main(String[] args) {
		int[] a= {4,5,6,8,2,9,10};
		
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("maxmun number::"+max);
	}

}
