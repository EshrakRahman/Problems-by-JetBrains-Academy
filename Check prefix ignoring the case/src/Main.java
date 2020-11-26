import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if (inputString.charAt(0) == 'j' || inputString.charAt(0) == 'J') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}