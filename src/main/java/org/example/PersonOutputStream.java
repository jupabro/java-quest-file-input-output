package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonOutputStream extends ObjectOutputStream {

    public PersonOutputStream(String file) throws IOException {
        super(new FileOutputStream(file));
    }

    public void writePerson(Person person) throws IOException {
        writeObject(person);
    }
}
