package it.develhope.classesAndObjects;

public class Programmer {
    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;


    public String printProgrammerDetails() {
        return name + " - " + programmingLanguage + " - " + yearsOfExperience;
    }
}