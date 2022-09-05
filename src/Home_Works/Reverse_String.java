package Home_Works;

public class Reverse_String {

	public static void main(String[] args) {
	    //string reverse
		String s1="Hello";
		String str="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			String str1=str+s1.charAt(i);
			 System.out.print(str1);
		}
		}
	}
