package Practice1;

public class VowelLatter {
	public static void main(String[] args) {
		String str="Lokonath";
		String s=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='a'||s.charAt(i)=='u') {
				System.out.println("Vowel Latter::"+s.charAt(i)+" position"+i);
			}
		}
	}

}
