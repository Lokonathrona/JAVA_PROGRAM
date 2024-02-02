package Practice;

public class ShortedString {
	public static void main(String[] args) {
		String name="lokonath Rona";
		String name1=name.toLowerCase();
		char[] ch=name1.toCharArray();
		char temp;
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(ch);
	}
}
