import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while((num = scanner.nextInt()) != 0) {
            sum += num;
        }
        System.out.println(sum);
    }
}