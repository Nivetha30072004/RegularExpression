import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void main(String[] args) {
        // Sample text containing email addresses
        String text = "Contact us at info@example.com or support@company.net for assistance.";

        // Regular expression pattern to match email addresses
        String emailPattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailPattern);

        // Create a matcher with our sample text
        Matcher matcher = pattern.matcher(text);

        // Find and display all occurrences of email addresses
        while (matcher.find()) {
            System.out.println("Email found: " + matcher.group());
			}
		}
	}