package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TeamInputStream extends ObjectInputStream  {


    public TeamInputStream(String file) throws IOException {
        super(new FileInputStream(file));
    }

    public Team readTeam() throws IOException, ClassNotFoundException {
        return (Team) readObject();
    }
}
