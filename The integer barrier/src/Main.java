import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int inputNumbers = 0;
        int sum = 0;

        for (int i = 1; i != inputNumbers; i++) {
            inputNumbers = scanner.nextInt();
            sum = sum + inputNumbers;

            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
            if (inputNumbers == 0) {
                System.out.println(sum);
                break;
            }
        }



    }
}