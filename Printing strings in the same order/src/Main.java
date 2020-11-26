import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        
        String firstInput = scan.nextLine();
        Scanner firstStr = new Scanner(firstInput);

        String secondInput = scan.nextLine();
        Scanner secondStr = new Scanner(secondInput);


        String thirdInput = scan.nextLine();
        Scanner thirdStr = new Scanner(thirdInput);

        while (firstStr.hasNext())
        {
            System.out.println(firstStr.next());
        }

        while (secondStr.hasNext())
        {
            System.out.println(secondStr.next());
        }

        while (thirdStr.hasNext())
        {
            System.out.println(thirdStr.next());
        }

    }
}
