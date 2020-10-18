class Solution {

    public int[] solution(int[] A, int K) {
        int counter = A.length;
        int[] B = new int[counter];

        for (int i = 0; i < counter; i++) {
            B[(i + K) % counter] = A[i];
        }

        return B;
    }
}