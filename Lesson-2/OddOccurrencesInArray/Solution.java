/*
 * The following assumptions are made:
 * 1. N is an odd integer within the range [1..1,000,000];
 * 2. each element of array A is an integer within the range [1..1,000,000,000];
 * 3. all but one of the values in A occur an even number of times.
 */

class Solution {

    public int solution(int[] A) {
        int N = A.length;
        int tmp = 0;
        int currentElement = 0;

        for (int i = 0; i < N; i++) {
            tmp = 0;
            currentElement = A[i];

            for (int j = 0; j < N; j++) {
                if (currentElement == A[j]) {
                    tmp++;
                }
            }

            if ((tmp & 1) != 0) {
                return currentElement;
            }
        }

        return -1;
    }
}