mport java.util.Random;

public class PasswordGeneratorValidator {
    import java.util.Random;

public class PasswordGeneratorValidator {
    private static final int MIN_LENGTH = 6;
    private static final int MAX_LENGTH = 12;
    private static final String SPECIAL_CHARACTERS = "@$*#";

    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("The generated password " + password + " is " + (isValid(password) ? "valid" : "invalid"));
    }

    public static String generatePassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generate a random length for the password between MIN_LENGTH and MAX_LENGTH
        int length = MIN_LENGTH + random.nextInt(MAX_LENGTH - MIN_LENGTH + 1);

        // Add random characters to the password
        for (int i = 0; i < length; i++) {
            char nextChar;
            // Decide the type of character (lowercase, uppercase, digit, or special character)
            int type = random.nextInt(4);
            switch (type) {
                case 0:
                    // Lowercase alphabet
                    nextChar = (char) ('a' + random.nextInt(26));
                    break;
                case 1:
                    // Uppercase alphabet
                    nextChar = (char) ('A' + random.nextInt(26));
                    break;
                case 2:
                    // Digit
                    nextChar = (char) ('0' + random.nextInt(10));
                    break;
                case 3:
                    // Special character
                    nextChar = SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length()));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }
            password.append(nextChar);
        }

        return password.toString();
    }

    public static boolean isValid(String password) {
        // Check length
        if (password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            return false;
        }

        // Check for at least one lowercase, one uppercase, and one special character
        boolean hasLower = false, hasUpper = false, hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (SPECIAL_CHARACTERS.indexOf(c) != -1) {
                hasSpecial = true;
            }
        }

        return hasLower && hasUpper && hasSpecial;
	}
	    }
