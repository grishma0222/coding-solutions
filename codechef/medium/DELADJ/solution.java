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
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int score=0;
	    for(int i=0;i<n-1;i++){
	        if(arr[i]>1){
	            int minus=Math.abs(arr[i]-arr[i+1]);
	            score +=minus;
	            arr[i]=0;
	            arr[i+1]=0;
	        }
	        else if(arr[i]==1){
	            arr[i]=0;
	            score +=arr[i];
	        }
	    }
	    System.out.println(score);
	}
	}
}
