import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int res=0;
if(x>y){res=x-y-1;}
else{res=y-x-1;}
        System.out.println(res);

	}
}
