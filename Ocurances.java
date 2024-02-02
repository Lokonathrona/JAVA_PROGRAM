package Practice;
import java.util.HashMap;

public class Ocurances {
	public static void main(String[] args) {
		String s="Lokonath Rona";
		String str=s.toLowerCase();
		char[] ch=str.toCharArray();
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);	
	}
}
