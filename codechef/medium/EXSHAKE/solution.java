import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int g=0;
            long p=0;
    for(int i=0;i<n;i++){
 p +=arr[i];
        long h=p*(p-1)/2;
        if(h<=m)
        {
            g++;
        }
        else{break;}
    }
    System.out.println(g);
        }

	}
}
