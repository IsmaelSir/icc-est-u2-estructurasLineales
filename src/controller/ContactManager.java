package controller;

import Materia.Models.NodeGenerico;
import models.Contact;
import models.LinkendList;

public class ContactManager {
    private LinkedList<Contact<?, ?>>contacts;

    public ContactManager(){
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.appendTotail(contact); 
    }

    public void printList() {
        contacts.print(); 
    }


    public Contact<?, ?> findContactByName(String name){
        NodeGenerico<Contact<?,?>> current = ContactManager.getHead(); // obtenemos para iterar la lista de
        //nombre
        while(current != null) {
            if (
                ((String) (current.getValue().getName())).equalsIgnoreCase(name)) {
                    return current.getValue();
            }
            while (current != null) {
                if(((String) current.getValue().getName()).equalsIgnoreCase(name)){
                    return current.getValue();
                }
                current = current.getNext();
                System.out.println(current);
                System.out.println(current.getNext());
            }
        }
        return null; // no se encontro un contacto con ese nombre
    }

    public static void deleteContactByName(String name) {
        NodeGenerico<Contact<?,?>> current = contacts.getHead();
        if(current == null)
        return;

        //Caso 1 si el contacto sea la Head o cabeza
        if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize(contacts.getSize()-1);
        }
        //Caso 2 en el resto de la lista
        while(current.getNext() != null){
            if(((String) current.getValue().getName()).equalsIgnoreCase(name)){
                contacts.setHead(contacts.getHead().getNext());
                contacts.setSize(contacts.getSize()-1);
                return;
            }
            current = current.getNext();
        }
    }
}
