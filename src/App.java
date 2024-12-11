
import Materia.queue.Queue;
import Materia.queue.QueueGeneric;
import Materia.stack.*;
import controller.MenuController;
import models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        //runStackGeneric();
        //runQueue();
        //runQueueGeneric();
        runContactManager();
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

    public static void runQueue(){
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
        System.out.println("Tamanio de la cola: "+cola.getSizeQueue());
        cola.printqueue();
    }
    public static void runQueueGeneric(){
        QueueGeneric<Pantalla> colageneric = new QueueGeneric<>();

        colageneric.enqueue(new Pantalla(1, "compu", "/Home"));
        colageneric.enqueue(new Pantalla(1, "compu", "/Home/archivos"));
        colageneric.enqueue(new Pantalla(1, "compu", "/Home/archivos/est"));

        System.out.println(colageneric.peek());
        //System.out.println(colageneric.dequeue());

        System.out.println("Estoy en: "+ colageneric.peek().getRuta());
        System.out.println("Tamanio= "+ colageneric.getSizeQueue());
        colageneric.printqueue();
    }

     public static void runContactManager(){
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }
}
