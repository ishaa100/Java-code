//import java.io.*;
public class Max_min_Array {
   
     static int max(int arr[], int n){
        int res= arr[0];
        for(int i=0;i<n;i++)
            res=Math.max(res, arr[i]);
            return res;
        
    }
     static int min(int arr[],int n){
        int res= arr[0];
        for(int i=0;i<n;i++)
            res=Math.min(res, arr[i]);
            return res;
        
    }
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	int arr[]= {3,6, 12, 1,0};
	int n=arr.length;
	System.out.println("The maximum element in array: " + max(arr,n));
	System.out.println("The minimum element in array: " + min(arr,n));
	}
	//public stativ void max()
}

    

