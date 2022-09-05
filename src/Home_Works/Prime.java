package Home_Works;// find prime number
public class Prime {
public static void main(String[] args) {
		int i;
		int j;
		for (i=1;i<=10;i++)
		{
		for(j=2;j<i;j++)// j less than i///< less than
		{
	    if(i%j==0)
		break;
		}
	    if(i==j)
		{
        System.out.println(i);
		}
		}
		}
        }
