package net.acegik.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pnhung177
 */
public class ValidationUtil {
    
    private static final String EMAIL_PATTERN_STRING =
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile(EMAIL_PATTERN_STRING);
    
    public static boolean verifyEmail(String email) {
        if (email == null) return false;
        return email.matches(EMAIL_PATTERN_STRING);
    }
    
    public static boolean verifyEmail2(String email) {
        if (email == null) return false;
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
}
