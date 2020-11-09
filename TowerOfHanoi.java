import java.util.*;

public class TowerOfHanoi {
    public static void towerHanoi(int noOfDisc, int tower1, int tower2, int tower3) {

        if (noOfDisc == 0) {
            return;
        }

        towerHanoi(noOfDisc - 1, tower1, tower3, tower2); // Left Call
        System.out.println(noOfDisc + "[" + tower1 + " -> " + tower2 + "]"); // In
        towerHanoi(noOfDisc - 1, tower3, tower2, tower1); // Right Call

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfDisc = scn.nextInt();
        int tower1 = scn.nextInt();
        int tower2 = scn.nextInt();
        int tower3 = scn.nextInt();
        towerHanoi(noOfDisc, tower1, tower2, tower3);
    }
}