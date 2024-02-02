package ProgramDAY6;

public class UniqueValues {
	public static void main(String[] args) {
		int a[] ={ 4,5,5,5,4,6,6,9,4};
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				System.out.println(a[i]+" ");
			}
			System.out.println(a[a.length-1]);
		}
	}

}
