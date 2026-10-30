/**
 *
 * Name Surname:    Alperen BELLİGÜN
 * Student ID:    240446014
 * Date:    26.10.2026
 */


public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "5+2*56-2/4",
                "123+45*6",
                "100/25-7"
        };

        // Print the input and output like in the expected output
        for (String equation : equations) {
            System.out.println("Input:  " + equation);

            // call static method
            String result = EquationReverser.reverseEquation(equation);
            System.out.println("Output: " + result);
            System.out.println();
        }
    }
}