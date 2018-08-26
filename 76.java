import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int ec=0,oc=0,in=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				ec++;
			}
			else if(a[i]%2==1)
			{
				oc++;
			}
		}
		if(ec>oc)
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==1)
				{
					in=i;break;
				}
			}
		}
		else 
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==0)
				{
					in =i;break;
				}
			}
		}
		System.out.print(a[in]);
	}
	
}
