package org.example;

import java.io.*;

public class PersonInputStream extends ObjectInputStream {
    public PersonInputStream(String file) throws IOException {
        super(new FileInputStream(file));
    }

    public Person readPerson() throws IOException, ClassNotFoundException {
        return (Person) readObject();
    }
}

