package Materia.stack;

import Materia.Models.Node;
import java.util.EmptyStackException;
//esta clase es para una pila
public class Stack {
    private Node top;  // nodo en la cima de nuestra pila
    private int size;

    //creamos la pila con la sima nula
    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    //metodo que retira el node de la cima
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--;
        return value;
        
    }

    // metodo que retorna el valor del node de la cima.
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printstakc(){
        Node current = top;
        while(current != null){
        System.out.print(current.getValue()+" - ");
        current = current.getNext();
        }
    }


    
    public int getSize(){
        /*int contador = 0;
        Node current = top;
        while(current != null){
        current = current.getNext();
        contador++;
        }
        return contador;*/
        // para hacer la complejidad del metodo getSize O(1)
        return size;
    }
}
