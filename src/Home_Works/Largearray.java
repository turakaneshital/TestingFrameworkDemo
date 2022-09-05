package Home_Works;

import java.util.Arrays;

public class Largearray {

	public static void main(String[] args) {
		   // Creating the array
        int arr[] = {12, 2, 34, 20, 54, 6};
        // Initializing the first element of the array to large
        int large=arr[0];        
        
        // Compares all the element to find out the largest one
        for(int i:arr)
        {
            if(large<i)
                large=i;
        }
        // Prints the array elements
        System.out.println("The array elements are"+Arrays.toString(arr) );
        
        // Prints the largest element
        System.out.println("The largest element of the array is: "+large);
    }

	}


