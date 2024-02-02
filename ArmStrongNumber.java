package ProgramDAY5;
public class ArmStrongNumber {			
	public static void main(String[] args) {
		int no=1634;	//1^4=1*1*1*1=1 + 6^4=6*6*6*6=1296 + 3^4=3*3*3*3=81 + 4^4=4*4*4*4=256 Total =1634
		int t1=no;
		int length=0;
		while(t1!=0) 
		{
			t1=t1/10;
			length=length+1;

		}
		System.out.println(length);

		int t2=no;
		int arm=0;
		while(t2!=0) 
		{
			int multi=1;
			int remender=t2%10;
			for(int i=1;i<=length;i++)
			{
				multi=multi*remender;
			}
			arm=arm+multi;
			t2=t2/10;
		}
		if(arm==no) 
		{
			System.out.println(no+" is ArmStrongNumber");
		}
		else {
			System.out.println(no+"is not ArmStrongNumber");
		}
	}
}
