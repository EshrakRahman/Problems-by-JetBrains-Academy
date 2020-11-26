import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputRoomsShape = scanner.nextLine();

        switch (inputRoomsShape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

                double  semiPerimeterOfTriangle = (a + b + c) / 2;

                double multiplicationSemiPerimeterOfTriangle = semiPerimeterOfTriangle * ((semiPerimeterOfTriangle - a)
                        * (semiPerimeterOfTriangle - b) * (semiPerimeterOfTriangle - c));
                double resultOfTriangle = Math.sqrt(multiplicationSemiPerimeterOfTriangle);
                System.out.println(resultOfTriangle);
                break;
            case "rectangle":
                double lengthOne = scanner.nextDouble();
                double lengthTwo = scanner.nextDouble();

                double areaOfRectangle = lengthOne * lengthTwo;
                System.out.println(areaOfRectangle);
                break;
            case "circle":
                double radiusOfCircle = scanner.nextDouble();

                double areaOfCircle = 3.14 * Math.pow(radiusOfCircle, 2);
                System.out.println(areaOfCircle);
                break;
            default:
                break;

        }
    }
}