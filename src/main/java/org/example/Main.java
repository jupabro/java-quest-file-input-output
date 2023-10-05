package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Mila", 7);

            // Writing a Person object to a file
            PersonOutputStream personOutputStream = new PersonOutputStream("person.txt");
            personOutputStream.writePerson(person);
            personOutputStream.close();

            // Reading a Person object from a file
            PersonInputStream personInputStream = new PersonInputStream("person.txt");
            Person loadedPerson = personInputStream.readPerson();
            personInputStream.close();

            System.out.println(loadedPerson.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            List<Person> teamMembers = new ArrayList<>();
            teamMembers.add(new Person("Mila", 7));
            teamMembers.add(new Person("Puki", 8));
            teamMembers.add(new Person("Blue", 2));

            Team team = new Team("Cat Team", teamMembers);

            // Writing a Team object to a file
            TeamOutputStream teamOutputStream = new TeamOutputStream("team.txt");
            teamOutputStream.writeTeam(team);
            teamOutputStream.close();

            // Reading a Team object from a file
            TeamInputStream teamInputStream = new TeamInputStream("team.txt");
            Team loadedTeam = teamInputStream.readTeam();
            teamInputStream.close();

            System.out.println("Loaded Team:");
            System.out.println("Team Name: " + loadedTeam.getTeamName());
            System.out.println("Number of People in Team: " + loadedTeam.getNumberOfPeople());
            System.out.println(loadedTeam.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}