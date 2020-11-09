import java.util.*;
import java.io.*;

public class Binary_Search {
    	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int n = scn.nextInt();
		int low = 0;
		int high = arr.length -1;

		while(low <= high){
			int mid = (low + high) / 2;
			if( n > arr[mid]){
				low = mid + 1;
			}else if ( n < arr[mid]){
				high = mid -1;
			}else{
				System.out.println( n+ " found at index : "+mid);
				return;
			}
		}
		System.out.println("Number not found");
	}		

    
}