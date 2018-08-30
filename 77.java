import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]=new int[20];
		int n,i,j,ct,max,ans=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
				a[i]=in.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			max=a[i];
			ct=0;
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j] )
				{
					ct++;
				}
				
			}
			if(ct>ans)
			{
				ans=ct;
			}
		}
		System.out.println(ans);	}
}
