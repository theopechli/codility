/*
 * The following assumptions are made:
 *  1. X, Y and D are integers within the range [1..1,000,000,000]
 *  2. X <= Y
 */

public class Main {

    public int solution(int X, int Y, int D) {
        float numOfJumps = ((float)Y - X) / D;

        if (numOfJumps % 1 != 0) {
            numOfJumps++;
        }

        return (int)numOfJumps;
    }
}