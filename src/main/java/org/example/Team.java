package org.example;

import java.io.Serializable;
import java.util.List;

public class Team implements Serializable {
    private static final long serialVersionUID = 1L; // Required for serializable classes

    private String teamName;
    private List<Person> teamMembers;

    public Team(String teamName, List<Person> teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Person> getTeamMembers() {
        return teamMembers;
    }

    public int getNumberOfPeople() {
        return teamMembers.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Team Members:\n");
        for (Person person : teamMembers) {
            sb.append(person.getName()).append(", Age: ").append(person.getAge()).append("\n");
        }
        return sb.toString();
    }
}

