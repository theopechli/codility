/*
 * The following assumptions are made:
 *  N is an integer within the range [0..100,000]
 *  the elements of A are all distinct
 *  each element of array A is an integer within the range [1..(N + 1)]
 */

class Solution {

    public int solution(int[] A) {
        int N = A.length;
        int result = (N + 1) * (N + 2) / 2;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
        }

        return result - sum;
    }
}
