package it.develhope.classesAndObjects;

public class Competition {
    public static void main(String[] args) {

        CompetitionRules rules = CompetitionRules.getInstance();
        System.out.println(rules.printRules() + "\n");

        Team teamA = new Team();
        teamA.teamName = "Kapkan";
        teamA.p1.name = "Alice";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 2;
        teamA.p2.name = "Pippo";
        teamA.p2.programmingLanguage = "Java";
        teamA.p2.yearsOfExperience = 4;

        Team teamB = new Team();
        teamB.teamName = "Ace";
        teamB.p1.name = "Mario";
        teamB.p1.programmingLanguage = "Assembly";
        teamB.p1.yearsOfExperience = 20;
        teamB.p2.name = "Bob";
        teamB.p2.programmingLanguage = "C";
        teamB.p2.yearsOfExperience = 12;


        System.out.println(teamA.printTeamDetails() + "\n");
        System.out.println(teamB.printTeamDetails());



    }
}
