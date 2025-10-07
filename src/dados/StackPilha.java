package dados;

import java.util.Stack;

public class StackPilha {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Página 1");
        stack.push("Página 2");
        System.out.println(stack.pop());

    }
}
