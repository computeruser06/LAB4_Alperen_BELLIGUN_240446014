/**
 *
 * Name Surname:    Alperen BELLİGÜN
 * Student ID:    240446014
 * Date:    26.10.2026
 */


public class EquationReverser {

    // why the method is static?
    // Because we want to call it without making a new object of EquationReverser. (EquationReverser.reverseEquation(...))
    public static String reverseEquation(String equation) {

        // create the object of the TokenStack class
        TokenStack stack = new TokenStack();

        int i = 0;

        // 1: Traverse the equation from left to right.
        while (i < equation.length()) {
            char current = equation.charAt(i); // get the letter/number

            // 2: If the current character is a digit
            if (Character.isDigit(current)) {
                // Remember the beginning of the number
                int start = i;

                // Move forward while the characters are digits
                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    i++;
                }

                // Push the whole number as one item.
                String number = equation.substring(start, i);
                stack.push(number);
            }
            // 3: Otherwise, push the operator.
            else {
                // we use String.valueOf to make char a String
                stack.push(String.valueOf(current));
                i++; // go to next character
            }
        }

        // 4: Pop all items from the stack and append them to a StringBuilder.
        // StringBuilder result = new StringBuilder() creates an empty builder. 
        StringBuilder result = new StringBuilder();

        while (stack.isEmpty() == false) {
            result.append(stack.pop()); // Each append() adds a character to it.
        }

        return result.toString(); // convert builder to standard string
    }
}