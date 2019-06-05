package coreJavaDemo;

public class FindStringProj 
{
	String input="sushil is good boy and google HR is";
	int count=0;
	public void setup()
	{
		String[] array=input.split(" ");
		
		for(int i=0;i<array.length;i++)
		{
			count++;
			if(array[i].equalsIgnoreCase("HR"))
			{
				System.out.println(array[i]+"="+count);
			}
		}
		
	}
		public void setup2()
		{
			String[] array=input.split(" ");
			
			int length= input.length();
			
			for(int i=0;i<length;i++)
			{
				if(array[i]=="l")
				{
					System.out.println(array[i]);
				}
				
			}
			
		}
		
	
	
	
	public static void main(String[] args)
	{
		FindStringProj obj=new FindStringProj();
		
		obj.setup2();
		
		
	}
	

}
