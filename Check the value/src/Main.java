import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int inputNumber = scanner.nextInt();

        boolean number = inputNumber > 0 && inputNumber < 10;
        System.out.println(number);
    }
}