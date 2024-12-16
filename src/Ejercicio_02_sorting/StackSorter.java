package Ejercicio_02_sorting;

import Materia.stack.StackGeneric;

public class StackSorter {

    public void sortStack(StackGeneric<Integer> stack) {
        StackGeneric<Integer> auxStack = new StackGeneric<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!auxStack.isEmpty() && auxStack.peek() > temp) {
                stack.push(auxStack.pop());
            }
            auxStack.push(temp);
        }
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }
}
