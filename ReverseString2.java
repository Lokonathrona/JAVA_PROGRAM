package Practice1;

public class ReverseString2 {

	public static void main(String[] args) {
							
		String s="Idexcel";
		String Rev="";
													//char ch;	
		for (int i = 0; i <s.length(); i++)
	{
		char ch=s.charAt(i);
		System.out.println(ch);
		Rev=ch+Rev;
	}
		System.out.println(Rev);	
	}
}
