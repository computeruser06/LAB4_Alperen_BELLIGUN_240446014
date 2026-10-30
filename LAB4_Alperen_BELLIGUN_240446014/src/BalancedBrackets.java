/**
 *
 * Name Surname:    Alperen BELLİGÜN
 * Student ID:    240446014
 * Date:    26.10.2026
 */


public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        // Create a stack
        BracketStack stack = new BracketStack();

        // 1. Traverse the string character by character.
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i); // get the letter

            // 2. If the character is an opening bracket, push it onto the stack.
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            }
            // 3. If it is a closing bracket:
            else if (current == ')' || current == ']' || current == '}') {

                // - Check whether the stack is empty.
                if (stack.isEmpty()) {
                    return false; // we have a closing bracket but no opening bracket in stack
                }

                // - Pop the top opening bracket.
                char topChar = stack.pop();

                // - Check whether the brackets match.
                if (isMatchingPair(topChar, current) == false) {
                    return false; // they do not match
                }
            }
        }

        // 4. At the end, check whether the stack is empty.
        // If it is empty, all brackets are matched.
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        // Check: ( matches )
        if (opening == '(' && closing == ')') {
            return true;
        }
        // Check: [ matches ]
        if (opening == '[' && closing == ']') {
            return true;
        }
        // Check: { matches }
        if (opening == '{' && closing == '}') {
            return true;
        }

        // if check doesnt match; then return false
        return false;
    }
}