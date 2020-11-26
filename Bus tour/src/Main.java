import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt();
        int numberOfBridge = scanner.nextInt();
        int bridgeSerial = 0;
        int heightOfBridge = 0;
        int check = 0;

        for (int i = 1; i <= numberOfBridge; i++) {
            heightOfBridge = scanner.nextInt();
            bridgeSerial++;

            if (heightOfBridge <= heightOfBus) {
                System.out.println("Will crash on bridge " + bridgeSerial);
                check++;
                break;
            }

        }
        if (check == 0) {
            System.out.println("Will not crash");
        }
    }
}

