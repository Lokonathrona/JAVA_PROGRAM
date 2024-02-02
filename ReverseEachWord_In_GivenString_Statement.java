package ProgramDAY3;

public class ReverseEachWord_In_GivenString_Statement {

	public static void main(String[] args) {
		
		String str="Java Code";
		
		String output="";
		String[] s=str.split(" ");
		for(String word:s) {
	
			String revWord="";
			
			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			output=output+revWord+" ";
		}
		System.out.println("reverse each Word::"+output);		
	}
}
