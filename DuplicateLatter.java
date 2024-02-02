package Practice;

public class DuplicateLatter {
	public static void main(String[] args) {
		String str="Lokonatn Rona";
		
		String str2=str.toLowerCase();
		char[] ch=str2.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate Character::"+ch[i]);
				}
			}
		}
	}

}
