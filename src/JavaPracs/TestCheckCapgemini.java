package JavaPracs;

public class TestCheckCapgemini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num="1010100101";
		int numValue=num.length()-1;
		int count=0;
		int j,k,l;
		for(int i=0;i<numValue;i++)
		{
			if(num.charAt(i)=='1')
			{
				j=i+1;
				if(num.charAt(j)=='0')
				{
					k=j+1;
					if(num.charAt(k)=='1')
					{
						count++;
					
					}
				
					else if(num.charAt(k)=='0')
					{
						l=k+1;
						if(num.charAt(l)=='1')
						{
							count++;
						
						}
					}
					else
					{
						continue;
					}
				}
			
				else
				{
					continue;
				}
			}
			
		}
		System.out.println("Counter :"+count);
	}

}
