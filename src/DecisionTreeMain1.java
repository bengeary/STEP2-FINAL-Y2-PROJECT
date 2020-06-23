

import java.io.*;
import java.util.Scanner;

public class DecisionTreeMain1 {
    public Scanner reader;
    private boolean wheelchair;
    private boolean kids;
    private boolean water;
    private boolean horror;
    private boolean adrenaline;
    public String firstName;
    private String answer;
    private String email;
    public int numOfPeople;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }


    public boolean getWater() {
        return water;
    }

    public boolean getHorror() {
        return horror;
    }

    public boolean getKids() {
        return kids;
    }

    public boolean getWheelchair() {
        return wheelchair;
    }

    public boolean getAdrenaline() {
        return adrenaline;

    }


    public void Questions(Scanner scanner) throws IOException {
        System.out.println("\nPlease Enter your first name: ");
        System.out.println("\n");
        firstName = scanner.nextLine();
        System.out.println("Hi " + getFirstName() + " Would you prefer me to print your results or email them to you? (Enter P to Print or E to mail) : ");
        System.out.println("\n");
        answer = scanner.nextLine();
        switch (answer.toUpperCase()) {
            case "P":
                System.out.println("You Will be able to pick up your reccomednations at the Kiosk when arriving");
                break;
            case "E":
                System.out.println("You have chosen email please enter a valid email address: ");
                email = scanner.nextLine();
                if (email.contains("@")) {
                    System.out.println("Thank you your reccomendations will be emailed to " + email + " and will also be displayed on Screen");
                } else do {
                    System.out.println("Sorry " + getFirstName() + "That is not a valid email address please try again");
                    email = scanner.nextLine();

                } while (!email.contains("@"));

        }
        System.out.println("How many people are in your party?");
        int numOfPeople = scanner.nextInt();
        System.out.println("Please Use the height chart next to this termnial to measure the height of person number");
        System.out.println("");
        for (int i = 0; i < numOfPeople; i++) {
            System.out.println("What height are you(inn metres e.g. 1.40)");
            int height = scanner.nextInt();
        }
    }

}








