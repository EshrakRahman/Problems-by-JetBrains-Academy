import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int thirdInput = scanner.nextInt();

        if ((firstInput + secondInput) > thirdInput && (firstInput + thirdInput) >
                secondInput && (secondInput + thirdInput) > firstInput) {
                    
            System.out.println("YES");

        } else {
            
            System.out.println("NO");
        }
    }
}
