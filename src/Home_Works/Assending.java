package Home_Works;

import java.util.Arrays;

public class Assending {

	public static void main(String[] args) {
		int p[]= {3,4,89,90,67,45,56,12,70};
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]+" ");
		}

		System.out.println();
		System.out.println("********Assending Order********");
		Arrays.sort(p);
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]+" ");
		}
	}

}
