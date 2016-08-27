package player_LEVEL;

import java.util.Scanner;

public class RvrseStringorder {
	public static void main(String[]args)
	{
		String real;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		real=s.nextLine();
		StringBuffer sb=new StringBuffer(real);
		sb.reverse();
	    System.out.println("Reverse of entered string is: "+sb);
	}

}
