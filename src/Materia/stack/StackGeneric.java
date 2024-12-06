package Materia.stack;

import java.util.EmptyStackException;
import Materia.Models.NodeGenerico;

public class StackGeneric<T> {

    private NodeGenerico<T> top; // Nodo generico
    private int size; // variable

    // crea una Pila instanciando el nodo como nulo y el tamanio como cero.
    public StackGeneric(){
        this.top = null;
        this.size = 0;
    }

    // Metodo para agregar un elemento a una pila.

    public void push(T dato){
        NodeGenerico<T> newNode = new NodeGenerico<>(dato);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;//
    }

    public boolean isEmpty(){
        return top == null;
    }

    //Metodo que retorna el valor de la cima
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public int getSize(){
        return size;
    }

    public void printstakc(){
        NodeGenerico<T> current = top;
        while(current != null){
        System.out.println(current.getValue());
        current = current.getNext();
        }
    }

    public NodeGenerico<T> popNode() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        NodeGenerico<T> poppedNode = top; // Guardar el nodo actual
        top = top.getNext(); // Mover el puntero al siguiente nodo
        size--;
        return poppedNode; // Retornar el nodo completo
    }
}
