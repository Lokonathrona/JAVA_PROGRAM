package ProgramDAY3;

public class LongestWord {
	public static void main(String[] args) {
		String str="I am an intern at geeksforgeeks";
		
		String[] s=str.split(" ");
		int length=0;
		
		for(String word:s) {
			if(length<word.length()) {
				length=word.length();
			}
		}
		System.out.println(length);
		
	}
}
