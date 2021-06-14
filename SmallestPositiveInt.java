
/*
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/
import java.util.*;

class Solution {
    public static void main(String args[]) {

        // change the numbers in the array as a test!
        int[] A = new int[] {7,5,8,6,2,3,1,4};

        Arrays.sort(A);
        int min = 1;
        int max = A.length;

        for (int i = 0; i < max; i++) {
            if (A[i] == min) {
                min++;
            }
        }
        System.out.println(min);
    }
}
