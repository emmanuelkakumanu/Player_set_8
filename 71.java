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
		int b[]=new int[n];
		int k=0;
		for(int i=0;i<n-1;i++)
		{
			//if(i<n-1)
			b[k++]=Math.max(a[i],a[i+1]);
			//else
			//break;
			
		}
		System.out.print(b[0]);
		for(int i=1;i<k;i++)
		System.out.print(" "+b[i]);
	}
}
