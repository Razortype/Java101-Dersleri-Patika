import java.util.Scanner;

public class Main {

    private static String validUsername = "username";
    private static String validPassword = "password";

    static boolean checkLoginValid(String username, String password) {
        return username.equals(validUsername) && password.equals(validPassword);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username, password;
        boolean isValid = false;

        System.out.println("Welcome to login system");

        System.out.print("Enter your username >> ");
        username = scanner.next();
        System.out.print("Enter your password >> ");
        password = scanner.next();

        isValid = checkLoginValid(username, password);
        if (isValid) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Error Occurred!");
        }

        scanner.close();

    }
}