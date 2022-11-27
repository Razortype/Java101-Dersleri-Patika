import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temperature;
        String result = "Kayak";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current temperature >> ");
        temperature = scanner.nextInt();

        if (temperature > 5) { result = "Sinema"; }
        else if (temperature > 15) { result = "Piknik"; }
        else if (temperature > 25) { result = "Yüzme"; }

        System.out.println("Gitmek için uygun : " + result);

        scanner.close();


    }
}