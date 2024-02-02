package ProgramDAY6;

public class CommonElementFromTwoArrays {
	public static void main(String[] args) {
		int[] arr1= {4,3,7,9,2};
		int[] arra2={5,1,4,8,3};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arra2.length;j++) {
				if(arr1[i]==arra2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
