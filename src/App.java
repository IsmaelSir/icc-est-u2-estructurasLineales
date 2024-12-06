
import Materia.stack.*;
import models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        runStackGeneric();
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

    public static void runStackGeneric(){
        StackGeneric<Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "User Page", "/home/menu/users"));

        System.out.println("Estoy en: "+ router.peek().getRuta());
        System.out.println("Regreso a: "+((router.popNode().getNext().getValue())).getRuta());
        System.out.println("Estoy en: "+ router.peek().getRuta());

        router.push(new Pantalla(1, "Setting Page", "/home/menu/setting"));

        System.out.println("Pantallas= " + router.getSize());
        System.out.println("Estoy en: " + router.peek().getRuta());
        router.printstakc();
    }
}
