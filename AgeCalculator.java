import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birthday
        System.out.print("Enter your birthday in the format 'YYYY-MM-DD': ");
        String birthdayString = scanner.nextLine();

        // Parse the input string to LocalDate object
        LocalDate birthday = LocalDate.parse(birthdayString);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthday and the current date
        Period period = Period.between(birthday, currentDate);

        // Extract years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Display the age
        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");

        // Close the scanner
        scanner.close();
 }
}