package Practice;

public class DuplicateElement {
	    public static void main(String[]args){
	        String[] str={"java","python","ruby","python","java"};
	        
	        for(int i=0;i<str.length;i++){
	            for(int j=i+1;j<str.length;j++){
	                if(str[i]==(str[j])){
	                    System.out.println("Duplicate Element::"+str[i]);
	                }
	            }
	        }
	    }
}
