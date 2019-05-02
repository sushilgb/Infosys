package coreJavaDemo;

public class ReversStringProj 
{
	String input="RAKRUOG lihsus "; 
	
	String output=" ";
	public void setup()
	{
		char[] array=input.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			output=output+array[i];
		}	
		System.out.print(output);
	}
	
	public void setup2()
	{
		char[] array=input.toCharArray();
		
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]);
		}
	}
	public static void main(String[] args)
	{
		ReversStringProj obj=new ReversStringProj();
		obj.setup();
		obj.setup2();
	}

}
