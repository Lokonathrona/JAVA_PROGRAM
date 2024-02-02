package Practice1;

public class ReverseSunName {
	public static void main(String[] args) {
		String str="Lokonath Rona";
		String[]s=str.split(" ");
		String rev="";
		
		for(int i=s[1].length()-1;i>=0;i--) {
		rev=rev+s[1].charAt(i);	
		}
		System.out.println("Reverse Sun Name::"+s[0]+" "+rev);
	}

}
