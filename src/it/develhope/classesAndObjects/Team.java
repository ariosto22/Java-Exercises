package it.develhope.classesAndObjects;

public class Team {
    public String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public String printTeamDetails() {
        return teamName + "\n" + p1.printProgrammerDetails() + "\n" + p2.printProgrammerDetails();
    }
}
