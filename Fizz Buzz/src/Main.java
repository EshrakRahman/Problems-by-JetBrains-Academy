import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int fistInput = scanner.nextInt();
        int secondInput = scanner.nextInt();

        for (int i = fistInput; i <= secondInput; i++ ){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }
    }
}