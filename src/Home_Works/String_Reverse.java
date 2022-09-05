package Home_Works;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		
		//String s1="Hellow";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String=");
		String s1=s.next();
		//string reverse
		String str="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			String str1=str+s1.charAt(i);
			 System.out.print(str1);
		}
		}
	    }
