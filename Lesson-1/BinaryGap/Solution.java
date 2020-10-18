class Solution {

    public int solution(int N) {
        String bin = Integer.toBinaryString(N);

        int maxGap = 0;
        int tmp = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0') {
                tmp++;
            }
            else if (maxGap < tmp) {
                maxGap = tmp;
                tmp = 0;
            }
            else {
                tmp = 0;
            }
        }

        return maxGap;
    }
}
