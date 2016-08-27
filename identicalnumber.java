package Hunter_LEVEL;

import java.util.Scanner;

public class identicalnumber {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		int n,count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a=new int[n];
		Scanner reader=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			a[i]=reader.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count=count+1;
				}
			}
			if(count==0)
	    	 {
				System.out.println(a[i]);
	    	 }
		}
	}
}
