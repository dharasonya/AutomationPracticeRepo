package JavaPracs;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo Test");

		String text="ttt";
		int strLength=text.length()-1;
		System.out.println(strLength);
		
		for(int i=0;i<=strLength;i++)
		{
			 if(text.charAt(i)=='a' || text.charAt(i)=='e')
			 {
				 System.out.println("Vowel");
				 break;
			 }
			 else
			 {
				 continue;
			 } 
		}
		
	}

}
