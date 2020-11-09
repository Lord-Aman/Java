import java.io.*;
import java.util.*;

public class Shell_Rotation {

    public static void rotateShell(int[][] arr, int s, int r){
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr,s,oned);
    }
    
    public static int[] fillOnedFromShell(int[][] arr, int s){
        int minr = s -1;
        int minc = s -1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int onedSize = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[onedSize];

        int idx =0;
        // Left wall
        for(int i = minr,j=minc; i <= maxr; i++){
            oned[idx] = arr[i][j];
            idx++;
        }
        // Bottom wall
        for(int i=maxr, j= minc + 1; j <= maxc; j++){
            oned[idx] = arr[i][j];
            idx++;
        }
        // Right wall
        for(int i = maxr -1,j = maxc; i >= minr; i--){
            oned[idx] = arr[i][j];
            idx++;
        }

        // Top wall
        for(int i = minr,j = maxc -1; j >= minc +1 ; j--){
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned;
    }
    public static void fillShellFromOned(int[][] arr, int s, int[] oned){
        int minr = s -1;
        int minc = s -1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;
        // Left wall
        for(int i = minr,j=minc; i <= maxr; i++){
            arr[i][j] = oned[idx];
            idx++;
        }
        // Bottom wall
        for(int i=maxr, j= minc + 1; j <= maxc; j++){
            arr[i][j] = oned[idx];
            idx++;
        }
        // Right wall
        for(int i = maxr -1,j = maxc; i >= minr; i--){
            arr[i][j] = oned[idx];
            idx++;
        }
        // Top wall
        for(int i = minr,j = maxc -1; j >= minc + 1; j--){
            arr[i][j] = oned[idx];
            idx++;
        }

    }
    public static void rotate(int[] oned , int r){
        r = r % oned.length;
        if( r < 0){
            r = r + oned.length;
        }

        reverse(oned,0, oned.length - r -1);
        reverse(oned,oned.length - r, oned.length -1);
        reverse(oned,0, oned.length -1);

    }
    public static void reverse(int[] oned, int li, int ri){
        while(li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int column = scn.nextInt();
        int[][] arr = new int[row][column];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        rotateShell(arr, s, r);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}