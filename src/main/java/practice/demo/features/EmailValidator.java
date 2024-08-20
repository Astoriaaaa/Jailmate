package practice.demo.features;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;

@Component
public class EmailValidator {
    // Define the regex pattern for a valid email address
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    // Compile the regex pattern
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    // Method to validate email
    public boolean isValidEmail(String email) {
        if (email == null) {
            return false; // Null check
        }
        
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
}
