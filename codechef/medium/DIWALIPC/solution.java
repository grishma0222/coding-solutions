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
	    int p=sc.nextInt();
	    int d=sc.nextInt();
	    int k=sc.nextInt();
	    int b=sc.nextInt();
	    int res=p+(d*k);
	    if(res<=b) System.out.println("YES");
	    else System.out.println("NO");
	}

	}
}
