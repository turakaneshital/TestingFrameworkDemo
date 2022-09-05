package Home_Works;
public class Arrprime {
public static void main(String[] args) {
		 int a [] ={1, 3, 5, 7, 23,17,10,20};
		 int k=0;
		 for(int i=0;i<(a.length-1);i++)
		 {
		 if((a[i]!=0) &&(a[i]!=1))
		 {
		 for(int j=2;j<a[i];j++)
		 {
		 if(a[i]%j==0)
		 {
		 k=1;
		 break;
		 }
		 }
		 if(k==0)
		 {
		 System.out.println(a[i]);
		 }
		 }
		 }
		 }
		}


