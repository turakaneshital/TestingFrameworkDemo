package Home_Works;
// find largest no from array
public class Lararray {
public static void main(String[] args) {
		int arr[]= {23,34,122,10,8,6000,50}	;
		int temp=0;
	    for(int i=0;i<arr.length;i++)
		  {
			for(int j=i+1;j<=arr.length-1;j++)
		    {
			if(arr[i]<arr[j])
		    {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			}
		    }
	     //largest number
		System.out.println("Largest Number of Array="+arr[0]);
		//largest second number
		System.out.println("Largest Second Number of Array="+arr[1]);
		//largest 3rd number
		System.out.println("Largest Third Number of Array="+arr[2]);
	}
}
