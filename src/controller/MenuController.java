package controller;

import models.Contact;
import view.ConsoleView;
import models.LinkendList;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            consoleView.displayMenu();
            String option = consoleView.getInput("Choose an option: ");
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    exit = true;
                    consoleView.showMessage("Exiting...");
                    break;
                default:
                    consoleView.showMessage("Invalid option. Try again.");
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Enter name: ");
        String phone = consoleView.getInput("Enter phone: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contact added successfully!");
    }
    
    private void findContact() {
        String name = consoleView.getInput("Enter a name to search");
        Contact<?,?> contact = contactManager.findContactByName(name); // Usa la instancia
        if(contact != null) {
            consoleView.showMessage("Contact found: " + contact);
        } else {
            consoleView.showMessage("Contact not found 404");
        }
    }
    
    private void deleteContact() {
        String name = consoleView.getInput("Enter a name to search");
        contactManager.deleteContactByName(name); // Usa la instancia
        consoleView.showMessage("Contact deleted (if existed).");
    }
    

    private void printList() {
        consoleView.showMessage("Printing all contacts:");
        contactManager.printList(); // Llama al método printList de ContactManager
    }
}
