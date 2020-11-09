import java.util.*;

public class demo{
  public static void main(String[] args) {

    String str = new String("abcde");

    for(int i=0; i < str.length(); i++){
      for(int j= i+1; j <= str.length(); j++){
        System.out.println(str.substring(i,j));
      }
    }
  }
}
