import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static final Integer passGrade = 55;

    static List<Integer> eliminateInvalidNotes(List<Integer> numbers) {
        List<Integer> results = new ArrayList<>();
        numbers.stream().forEach(i -> {
            if ((i>=0) && (i<=100)) { results.add(i); }
        });
        return results;
    }

    static double getAverage(List<Integer> numbers) {
        double total = numbers.stream().reduce(0, Integer::sum);
        return total / numbers.size();
    }

    public static void main(String[] args) {

        List<Integer> notes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your math note >> ");
        notes.add(scanner.nextInt());

        System.out.print("Enter your turkish note >> ");
        notes.add(scanner.nextInt());

        System.out.print("Enter your physic note >> ");
        notes.add(scanner.nextInt());

        System.out.print("Enter your chemistry note >> ");
        notes.add(scanner.nextInt());

        System.out.print("Enter your music note >> ");
        notes.add(scanner.nextInt());

        // If any of grade bigger than 100 or less than 0 will be eliminated
        if (getAverage(eliminateInvalidNotes(notes)) >= passGrade) {
            System.out.println("You passed.");
        } else {
            System.out.println("You failed!");
        }

    }
}