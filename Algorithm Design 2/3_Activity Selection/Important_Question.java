/*QUESTION
 *............................................................................................................
 * Given n number of ropes of various length. you need to join these ropes to make a single rope. the cost of 
 * joining two ropes length a and b is (a + b) which is their combined length. you need to find the minimum 
 * cost of joining all the ropes. the minimum cost of joining rope is obtained when we always join the two 
 * smallest ropes.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Important_Question {

    public static void main(String[] args) {
        int[] ropeLengths = {1, 3, 11, 5};
        System.out.println("Minimum cost to connect ropes: " + minCostToConnectRopes(ropeLengths));
    }

    private static int minCostToConnectRopes(int[] ropeLengths) {
        Rope[] ropes = new Rope[ropeLengths.length];

        for (int i = 0; i < ropeLengths.length; i++) {
            ropes[i] = new Rope(ropeLengths[i], i);
        }

        Arrays.sort(ropes, Comparator.comparingInt(a -> a.length));

        int totalCost = 0;
        for (int i = 0; i < ropes.length - 1; i += 2) {
            int joinedRopeLength = ropes[i].length + ropes[i + 1].length;
            totalCost += joinedRopeLength;

            ropes[i + 1].length = joinedRopeLength;
            ropes[i + 1].index = -1; // Mark the joined rope as invalid
        }

        return totalCost;
    }

    private static class Rope {
        int length;
        @SuppressWarnings("unused")
        int index;

        public Rope(int length, int index) {
            this.length = length;
            this.index = index;
        }
    }
}

/* OUTPUT
 * ..................................
 * Minimum cost to connect ropes: 20
 */