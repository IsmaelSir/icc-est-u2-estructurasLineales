package Ejercicio_01_sing;

import Materia.stack.StackGeneric;

public class SingValidator {

public Boolean stackValidir(String signo){
            StackGeneric<Character> stack = new StackGeneric<>();
            for (char ch : input.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }
                else if (ch == ')' || ch == '}' || ch == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if (!matches(top, ch)) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
        private boolean matches(char open, char close) {
            return  (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']');
        }
}
