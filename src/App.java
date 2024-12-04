
import Materia.stack.*;

public class App {
    public static void main(String[] args) throws Exception {
        runStack();
    }

    public static void runStack(){
        // Instanciar la clase
        Stack stack = new Stack();

        //
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        stack.printstakc();
        System.out.println("\nConatidad= "+ stack.getSize());

        System.out.println("Cima   ->"+stack.peek());
        System.out.println("Retirar->"+stack.pop());
        System.out.println("Cima   ->"+stack.peek());
        System.out.println("Retirar->"+stack.pop());
        System.out.println("Cima   ->"+stack.peek());
    }
}
