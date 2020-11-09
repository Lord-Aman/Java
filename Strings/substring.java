import java.util.*;

public class substring{
  public static void main(String[] args) {
    String s = "abcd";

    //Code to write all the substrings
    for(int i=0; i < s.length(); i++){
      for(int j= i+ 1; j <= s.length() ; j++){
        System.out.println(s.substring(i,j));
      }
    }
  }
}
