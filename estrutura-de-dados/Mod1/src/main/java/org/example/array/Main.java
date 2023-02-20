package org.example.array;

import org.example.array.Contact;

public class Main {

    private final static Integer NUMBERS_OF_CONTACTS = 5;

    public static void main(String[] args) {
        Contact[] contacts = new Contact[NUMBERS_OF_CONTACTS];


        Contact contact1 = new Contact("John Doe 1", "552342432");
        Contact contact2 = new Contact("John Doe 2", "552342432");
        Contact contact3 = new Contact("John Doe 3", "552342432");
        Contact contact4 = new Contact("John Doe 4", "552342432");
        Contact contact5 = new Contact("John Doe 5", "552342432");

        contacts[0] = contact1;
        contacts[1] = contact2;
        contacts[2] = contact3;
        contacts[3] = contact4;
        contacts[4] = contact5;

        for (int i = 0; i < NUMBERS_OF_CONTACTS; i++) {
            System.out.printf("CONTACT [%d] = [%s, %s]\n", i, contacts[i].getName(), contacts[i].getNumber());
        }
    }
}