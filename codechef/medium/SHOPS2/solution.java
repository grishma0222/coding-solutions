import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	    int n=sc.nextInt();
	    int d=sc.nextInt();
	    int[] a=new int[n];
	    int[] b=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        b[i]=sc.nextInt();
	    }
	    int sum1=0,sum2=0,summin=0;
	    for(int i=0;i<n;i++){
	        sum1 +=a[i];
	        sum2 +=b[i];
	        summin=Math.min(sum1,sum2);
	    }
	    int ans=Math.min(d+sum1,Math,min(d+sum2,2*d+summin));
	    System.out.println(ans);
	}

	}
}
