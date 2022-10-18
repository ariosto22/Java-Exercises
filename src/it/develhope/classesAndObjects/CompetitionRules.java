package it.develhope.classesAndObjects;

public class CompetitionRules {

    private static CompetitionRules rules = new CompetitionRules();
    private String competitionRule1 = "Do not copy and paste from StacOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    private CompetitionRules () {}

    public static CompetitionRules getInstance() {
         return rules;
    }

    public String printRules() {
        return competitionRule1 + "\n" + competitionRule2 + "\n" + competitionRule3;
    }

}
