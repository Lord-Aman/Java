import java.util.*;

public class First_And_Last_Index {
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];

        for( int i =0; i< n; i++){
            arr[i]= scn.nextInt();
        }
        int data = scn.nextInt();

        int low =0;
        int high = arr.length -1;
        int firstIndex = -1;

        while( low <= high){
            int mid = (low+high)/2;
            if(data > arr[mid]){
                low = mid+1;
            }
            else if( data < arr[mid]){
                high = mid -1;
            }else{
                firstIndex = mid;
                high = mid - 1;
            }
        }
            System.out.println(firstIndex);
            int low1 = 0;
            int high1 = arr.length -1;
            int lastIndex = -1;

            while(low1 <= high1){
                int mid = (low1 + high1)/2;
                if( data > arr[mid]){
                    low1 = mid + 1;
                }else if ( data < arr[mid]){
                    high1 = mid -1;
                }else{
                    lastIndex = mid;
                    low1= mid + 1;
                }
            }
            System.out.println(lastIndex);
    }


}
