package ProgramDAY4;

public class StringTochar {
		public static void main(String[] args) {

		int number[]={2,7,11,15};
		int target=9;
		
		for(int i=0;i<number.length;i++){
		for (int k : number) {
		if ((number[i] + k) == target) {
		System.out.println("x=" + number[i] + "," + "j=" + k);
		}
		}
		}
		}

		
}
