package it.develhope.classesAndObjects;

public class TestProgrammer {

    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        programmer1.age = 22;
        programmer1.name = "Alfredo";
        programmer1.wearsGlasses = false;

        Programmer programmer2 = new Programmer();
        programmer2.age = 27;
        programmer2.name = "Emanuele";
        programmer2.wearsGlasses = true;

        System.out.println("------------------------------------------");
        programmer1.drinkCoffe();
        programmer1.printDetails();
        System.out.println("------------------------------------------");
        programmer2.printDetails();
        programmer2.hasGlasses();
        System.out.println("------------------------------------------");

    }
}