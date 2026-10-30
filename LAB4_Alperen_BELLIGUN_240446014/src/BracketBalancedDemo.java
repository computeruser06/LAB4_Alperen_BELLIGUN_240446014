/**
 *
 * Name Surname:    Alperen BELLİGÜN
 * Student ID:    240446014
 * Date:    26.10.2026
 */


public class BracketBalancedDemo {

    public static void main(String[] args) {

        System.out.println("========== BALANCED BRACKET TEST ==========");

        String[] expressions = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };

        // read all expressions one by one
        for (String expression : expressions) {
            boolean result = BalancedBrackets.isBalanced(expression);
            System.out.println("Input: " + expression + " -> Output: " + result);
        }
    }
}