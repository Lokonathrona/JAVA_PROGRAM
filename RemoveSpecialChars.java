package ProgramDAY5;

public class RemoveSpecialChars {
	public static void main(String[] args) {
		
		String name="l@#$%o$%ko%^n#%&a#^&t&^$h";
		
		String name2=name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(name2);
	}
	

}
