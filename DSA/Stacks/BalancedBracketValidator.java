import java.util.*;

public class BalancedBracketValidator {

    public static boolean isValidConfig(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bracket string: ");
        String s = sc.nextLine();

        if (isValidConfig(s)) {
            System.out.println("Valid Brackets");
        } else {
            System.out.println("Invalid Brackets");
        }

        sc.close();
    }
}