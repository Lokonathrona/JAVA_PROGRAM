package Practice1;

public class PalindromString {
	public static void main(String[] args) {
		String str="mom";
		String palindrom="";
		
		for(int i=str.length()-1;i>=0;i--) {
			palindrom=palindrom+str.charAt(i);
		}
		if(str.equals(palindrom)) {
			System.out.println("Given String Palindrom");
		}
		else {
			System.out.println("Given String Not Palindrom");
		}
	}

}
