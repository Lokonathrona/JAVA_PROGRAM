package ProgramDAY5;

public class SeparateCharIntSpChar {
	public static void main(String[] args) {
		
		String str="abc123@#$23xyz";
		
		String alpha="";
		String number="";
		String Splchar="";
		char ch[]=str.toCharArray();

		for(int i=0;i<str.length();i++) {
			 if(Character.isDigit(ch[i])) {
				 
				 number=number+ch[i];
			 }
			  else if(Character.isAlphabetic(ch[i])) {
				 
				 alpha=alpha+ch[i];
			 }
			 else {
				 Splchar=Splchar+ch[i]; 
			 }
			 
		}
		System.out.println(alpha+" "+number+" "+Splchar);
	}

}
