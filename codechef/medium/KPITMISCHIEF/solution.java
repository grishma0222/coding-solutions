import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=sc.next();
		int c=0,max=0;
		int start=0,maxstart=0;
		for(int i=0;i<n;i++)
		{
		    if(st.charAt(i)=='m'){ c++;
		    if(c>max)
		    {
		        max=c;
		        maxstart=start;
		    }
		}
		else{
		    c=0;
		    start=i+1;
		}
		}
		int maxend=maxstart+max-1;
		System.out.println(maxstart+" "+maxend);

	}
}
