package Practice;

public class ReverseFullString {
	public static void main(String[] args) {
		String str="Java learing we are";
		String[]s=str.split("\\s");
		String result="";

		
		for(int i=s.length-1;i>=0;i--) {
			result=result+s[i]+" ";
		}
		System.out.println(str);
		System.out.println(result);
	}

}
	