package Home_Works;

public class Dupliarray {

	public static void main(String[] args) {
		  //Initialize array   
        int [] a = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3, 4};   
          
        System.out.println("****Duplicate elements in given array****");  
        //Searches for duplicate element  
        for(int i = 0; i < a.length; i++) 
        {  
            for(int j = i + 1; j < a.length; j++)
            {  
                if(a[i] == a[j])  
                 System.out.print(a[j]+",");  
            }  
        }      
    }  

	}


