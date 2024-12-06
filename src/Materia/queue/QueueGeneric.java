package Materia.queue;

import java.util.NoSuchElementException;
import Materia.Models.NodeGenerico;

public class QueueGeneric<T> {
    
    private NodeGenerico<T> front; //nodo al frente de la cola
    private NodeGenerico<T> rear; //nodo al final de la cola
    private int size = 0;

    public QueueGeneric(){
        this.front = null;
        this.rear = null;
    }

    //Meotodo para encolar nodos
    public void enqueue (T value){
        NodeGenerico<T> newNode = new NodeGenerico<>(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    // Desencolar el nodo
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T value = front.getValue();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    // devuelve la cabesa de la cola pero no lo saca
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return front.getValue();
    }

    public boolean isEmpty(){
        return  front == null;
    }

    //el tamanio de la cola
    public int getSizeQueue(){
        return size;
    }

    //inprimir todos los elementos de la cola
    public void printqueue(){
        NodeGenerico current = front;
        while(current != null){
        System.out.print(current.getValue()+" - ");
        current = current.getNext();
        }
    }
}
