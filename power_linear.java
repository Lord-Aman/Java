import java.util.*;
import java.lang.*;

public class power_linear {

    public static int powLinear(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int nm1 = (int) Math.pow(x, n - 1);
        int power = x * nm1;
        return power;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = powLinear(x, n);
        System.out.println(ans);
    }
}
