package Home_Works;

import java.util.Arrays;

public class Desending {
//
	public static void main(String[] args) {
		
int[] arr= {30,180,50,600,90,1000};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("**********assending order*********");
		Arrays.sort(arr);
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
		
	}
	System.out.println();
	System.out.println("********dessending order********");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
	
		
	
	}
}

