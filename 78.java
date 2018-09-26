import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		int c[]=new int[n+m];int k=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			c[k++]=a[i];
		}
		for(int i=0;i<m;i++)
		{
			b[i]=s.nextInt();
			c[k++]=b[i];
		}
		Arrays.sort(c);
		System.out.print(c[0]);
		for(int i=1;i<k;i++)
		System.out.print(" "+c[i]);
		
		
		
	}
}
