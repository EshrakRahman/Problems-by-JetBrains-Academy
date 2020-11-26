import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstInputNumber = scanner.nextInt();
        int secondInputNumber = scanner.nextInt();
        int thirdInputNumber = scanner.nextInt();

        boolean result = firstInputNumber >= secondInputNumber && thirdInputNumber >= firstInputNumber || 
                            thirdInputNumber <= firstInputNumber && firstInputNumber <= secondInputNumber;

        System.out.println(result);
    }
}
