// File: ExpressionEvaluation.java
import java.util.Stack;

class ExpressionEvaluation {

    static int evaluatePostfix(String[] exp) {
        Stack<Integer> stack = new Stack<>();

        for (String token : exp) {
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] exp = {"3","5","+","8","2","-","*"};
        System.out.println(evaluatePostfix(exp)); // 48
    }
}
