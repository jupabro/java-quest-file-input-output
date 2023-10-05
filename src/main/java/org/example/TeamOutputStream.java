package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TeamOutputStream {
    private final ObjectOutputStream objectOutputStream;

    public TeamOutputStream(String file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.objectOutputStream = new ObjectOutputStream(fileOutputStream);
    }

    public void writeTeam(Team team) throws IOException {
        objectOutputStream.writeObject(team);
    }

    public void close() throws IOException {
        objectOutputStream.close();
    }
}
