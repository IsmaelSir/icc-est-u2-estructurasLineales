package models;

import Materia.Models.NodeGenerico;

public class LinkendList<T> {
    //private NodeGenerico <T> head; //REFERENCIA AL PRIMER NODO
    private NodeGenerico<T> head;
    private int size = 0; // CONTADOR DEl NODO

    public void appendTotail(T value){
        if( head == null){
            head = new NodeGenerico<>(value);
        }else {
            NodeGenerico <T> current = head;
            while (current.getNext() != null){
                current = current.getNext();
            } 
            current.setNext(new NodeGenerico<>(value));
        }
        size++;

    }

    public void print() {
        if (head == null) {
            System.out.println("END");
            return;
        }
        NodeGenerico<T> current = head;
        while (current.getNext() != null) {
            System.out.println(current.getValue() + "->"); 
            current = current.getNext();
        }
        System.out.println(current.getValue() + " -> END");
    }


    public NodeGenerico<T> getHead() {
        return head;
    }

    public void setHead(NodeGenerico<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
