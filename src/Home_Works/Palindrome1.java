package Home_Works;
//A string is called a palindrome string if the reverse 
//of that string is the same as the original string. 
//For example, radar, level, etc. Similarly, a number that is equal 
//to the reverse of that same number is called a palindrome number.
//For example, 3553, 12321, etc.
public class Palindrome1 {
public static void main(String[] args) {
		 int i;
		 int sum=0;    
		 int n=454;//It is the number variable to be cShecked for palindrome  
		 int temp=n;    
		 while(n>0)
		  {    
		       i=n%10;  //getting remainder  
		       sum=(sum*10)+i;    
		       n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  
	


