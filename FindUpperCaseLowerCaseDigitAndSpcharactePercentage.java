package Practice;

public class FindUpperCaseLowerCaseDigitAndSpcharactePercentage {

		public static void main(String[] args) {
			String str="Naveen AutomationLabs 12356 %£";
			
				int len=str.length();
			int uppercasecount=0;
			int lowercasecount=0;
			int digitcount=0;
			int spcharcount=0;
			
			for(int i=0;i<len;i++) {
			
				char ch=str.charAt(i);
				
				if(Character.isUpperCase(ch)) {
					uppercasecount++;
				}
				else if(Character.isLowerCase(ch)) {
					lowercasecount++;
				}
				else if(Character.isDigit(ch)) {
					digitcount++;
				}
				else {
					spcharcount++;
				}
			}
				double uppercasepercentage=(uppercasecount*100.0)/len;
				double lowercasepercentage=(lowercasecount*100.0)/len;
				double digitcasepercentage=(digitcount*100.0)/len;
				double spcharcasepercentage=(spcharcount*100.0)/len;
				
				System.out.println("in the given String:"+str);

				System.out.println("upper case %-->"+uppercasepercentage);
				System.out.println("lowercase %-->"+lowercasepercentage);
				System.out.println("digitcase %-->"+digitcasepercentage);
				System.out.println("spcharcase %-->"+spcharcasepercentage);

				
			
		}

	}



