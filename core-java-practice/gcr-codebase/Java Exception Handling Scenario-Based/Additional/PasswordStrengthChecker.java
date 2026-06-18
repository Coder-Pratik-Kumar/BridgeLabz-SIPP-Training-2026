/**
 * Password Strength Checker
 * Rules:
 * 1. First character must be uppercase
 * 2. Last character must be a digit
 * 3. Length must be at least 8 characters
 * 4. Must contain at least one special character (@, #, $, %, &, *)
 */

public class PasswordStrengthChecker {
    
    // Validate password strength
    public static boolean isStrongPassword(String password) {
        try {
            if (password == null || password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be empty");
            }
            
            // Rule 1: First character must be uppercase
            if (!Character.isUpperCase(password.charAt(0))) {
                throw new IllegalArgumentException("First character must be uppercase");
            }
            
            // Rule 2: Last character must be a digit
            if (!Character.isDigit(password.charAt(password.length() - 1))) {
                throw new IllegalArgumentException("Last character must be a digit");
            }
            
            // Rule 3: Length must be at least 8
            if (password.length() < 8) {
                throw new IllegalArgumentException("Password length must be at least 8 characters");
            }
            
            // Rule 4: Must contain special character
            String specialChars = "@#$%&*";
            boolean hasSpecialChar = false;
            for (char c : password.toCharArray()) {
                if (specialChars.contains(String.valueOf(c))) {
                    hasSpecialChar = true;
                    break;
                }
            }
            
            if (!hasSpecialChar) {
                throw new IllegalArgumentException("Must contain at least one special character (@, #, $, %, &, *)");
            }
            
            return true;
            
        } catch (NullPointerException e) {
            System.out.println("ERROR - Null Password: " + e.getMessage());
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR - Invalid Password: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("ERROR - Unexpected: " + e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Password Strength Checker ===");
        System.out.println("Rules:");
        System.out.println("1. First character must be uppercase");
        System.out.println("2. Last character must be a digit");
        System.out.println("3. Length must be at least 8 characters");
        System.out.println("4. Must contain special character (@, #, $, %, &, *)\n");
        
        // Test cases
        String[] passwords = {
            "Valid@Pass1",        // Valid
            "valid@pass1",        // Fails rule 1
            "Valid@Pass",         // Fails rule 2
            "Val@1",              // Fails rule 3
            "ValidPass1",         // Fails rule 4
            "P@ssword123",        // Valid
            "",                   // Empty
            null,                 // Null
            "A@1",                // Too short
            "StrongP@ss99"        // Valid
        };
        
        for (int i = 0; i < passwords.length; i++) {
            System.out.println("[Test " + (i + 1) + "] Password: " + passwords[i]);
            boolean result = isStrongPassword(passwords[i]);
            System.out.println("Result: " + (result ? "STRONG" : "WEAK"));
            System.out.println();
        }
    }
}
