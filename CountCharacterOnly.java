package Practice;

public class CountCharacterOnly {
	public static void main(String[] args) {
		String str="lokonath rona";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
