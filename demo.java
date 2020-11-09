import java.io.*;
import java.util.*;

public class demo {
      public static boolean isPalindrome(String subString){

    int i= 0;
    int j = subString.length() -1;

    while( i <= j){
      char ch1 = subString.charAt(i);
      char ch2 = subString.charAt(j);

      if(ch1 != ch2){
        return false;
      }
      else{
        i++;
        j--;
      }
    }
    return true;
  }

	public static void solution(String str){
		//write your code here
				  //Getting all the printSubstring
    for(int i=0; i < str.length(); i++){
      for(int j= i+ 1; j <= str.length(); j++){
        String subString  = str.substring(i,j);
        if(isPalindrome(subString) == true){
          System.out.println(subString);
        }
      }
    }
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);


	}

}
