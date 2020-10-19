/*
 * The following assumptions were made:
 *  1. N is an integer within the range [2..100,000]
 *  2. each element of array A is an integer within the range [−1,000..1,000]
 */

class Solution {

    public int solution(int[] A) {
        int sumPartOne = 0;
        int sumPartTwo = 0;
        int tmp = 0;
        int min = 1001;

        for (int x = 0; x < N; x++) {
            sumPartOne = 0;
            sumPartTwo = 0;

            for (int i = 0; i < x + 1; i++) {
                sumPartOne += A[i];
            }

            for (int j = x + 1; j < N; j++) {
                sumPartTwo += A[j];
            }

            tmp = abs(sumPartOne - sumPartTwo);

            if (min > tmp) {
                min = tmp;
            }
        }

        System.out.println(min);
    }
}
