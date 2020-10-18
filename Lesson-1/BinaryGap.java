import java.util.Scanner;

public class BinaryGap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        int userInput = scanner.nextInt();
        String bin = Integer.toBinaryString(userInput);

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

        System.out.println("The binary gap of '" + bin + "' is " + maxGap);

        scanner.close();
    }
}
