package coreJavaDemo;

import java.util.ArrayList;
import java.util.List;

public class Wrapercalass 
{
	public static void main(String[] args) 
	{
		List<Integer> col=new ArrayList<>();
		col.add(1);
		col.add(2);
		
		for(int i: col)
		{
			if(i!=5)
			{
				System.out.println("got it");
				System.exit(0);
			}
			else
			{
				System.out.println("fail");
			}
			else
			{
				System.out.println("fail");
			}	
		}
	}
}