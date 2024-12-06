package Materia.Models;

public class NodeGenerico <T> {

    private T value;
    private NodeGenerico<T> next;

    public NodeGenerico (T value){
        this.value = value;
        this.next = null;
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setNext(NodeGenerico<T> next){
        this.next = next;
    }

    public NodeGenerico<T> getNext(){
        return next;
    }

    @Override
    public String toString(){
        return "Nodo{value=" + value + '}'; 
    }

}
