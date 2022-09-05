package Home_Works;// to find fibonacci series

public class fib {
// 0+1=1....n1=0,n2=1..n1+n2=n3...0+1=1..
//   1+1=2...n2+n3=n4..1+1=2...counter 
//     1+2=3
//       2+3=5
	static void fibonacci(int i)
	{
		int no1=0;
		int no2=1;
		int counter =0;
		while(counter < i)
		{
			System.out.println(no1 +" ");
			int no3=no2+no1;
			no1=no2;
			no2=no3;
			counter=counter+1;
			
		}
	}
	public static void main(String[] args) {
		int i=6;
		fibonacci(i);
	}

}
