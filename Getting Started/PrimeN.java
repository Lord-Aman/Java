import java.util.*;

public class PrimeN{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        while(testCases > 0){

            int number = scn.nextInt();
            int count =0;
            for(int divisor = 2; divisor * divisor <= number; divisor++)
            {
                if(number % divisor == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }

            testCases--;
        }
        scn.close();
    }
}