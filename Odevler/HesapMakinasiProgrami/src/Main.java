import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] operators = {"-","+","/","*"};

        double n1, n2, result = 0;
        char operator;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number >> ");
        n1 = scanner.nextDouble();

        System.out.print(String.format("Enter an operator %s >> ",String.join(",", operators)));
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number >> ");
        n2 = scanner.nextDouble();

        switch (operator) {
            case '-':
                result = n1 - n2;
                break;
            case '+':
                result = n1 + n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            default:
                System.out.println("Wrong operator declared!");
                System.exit(1);
        }

        System.out.println(String.format("%.1f %c %.1f = %.1f", n1, operator, n2, result));

    }
}