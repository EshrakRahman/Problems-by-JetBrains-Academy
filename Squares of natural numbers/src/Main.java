import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int square = 0;

        while (square <= input) {
            square++;
            int output = square * square;

            if (output <= input) {
                System.out.println(output);

            }
        }
    }
}