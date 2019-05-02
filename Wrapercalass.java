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
		col.add(3);
		col.add(4);
		col.add(5);
		col.add(6);
		col.add(7);
		col.add(8);
		col.add(9);
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
		}
	}
}