package Practice1;

public class LeepYear {
	public static void main(String[] args) {
		int year=2023;
		
		if(year%400==0) 
		{
			System.out.println("Leep Year");
		}
		else if(year%100==0) 
		{
			System.out.println("Not Leep Year");
		}
		else if(year%4==0) 
		{
			System.out.println("Leep Year");
		}
		else 
		{
			System.out.println("Not leep year");
		}
	}

}
