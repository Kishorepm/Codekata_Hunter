package Hunter_LEVEL;

import java.util.Scanner;

public class firstRepeat {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		int n,m = 0;
		
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
			for(int j=0;j<n-1;j++)
			{
				int temp=0;
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					m=a[i];
				}
			}
		}
		System.out.println(m);
		
	}

}
