package ProgramDAY4;

public class Stringtochararray {
	public static void main(String[] args) {
		String name="lokonath";
		
		char ch[]=name.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}

}
