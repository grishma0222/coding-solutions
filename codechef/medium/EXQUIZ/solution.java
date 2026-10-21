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
    int s=sc.nextInt();
    if(s==0) {System.out.println("0");}
  else  if(s>4*n){System.out.println("-1");}
  else{
      int c=(s+3)/4;
      int w=4*c-s;
      int a=c+w;
      if(a<=n)
      {
          System.out.println(a);
      }else{
          System.out.println("-1");
      }
  }
}

	}
}
