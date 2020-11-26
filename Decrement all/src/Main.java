import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int thirdInput = scanner.nextInt();
        int fourthInput = scanner.nextInt();

        firstInput -= 1;
        secondInput -= 1;
        thirdInput -= 1;
        fourthInput -= 1;

        System.out.println(firstInput + " " + secondInput + " " + thirdInput + " " + fourthInput + " ");

    }
}
