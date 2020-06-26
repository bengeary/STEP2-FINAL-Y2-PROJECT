//Ben Geary     RKB18204

import java.io.*;

public class DecisionTreeSingle {

    BufferedReader input = new
            BufferedReader(new InputStreamReader(System.in));
    DecisionTree newTree;


    public DecisionTreeSingle() throws IOException {

        newTree = new DecisionTree ();


        createTree();



    }


     void createTree() {

        newTree.createRoot(1,"Do any of the people in your party use a wheelchair");
        newTree.addNo(1,2,"Is the smallest person in the group taller than 1m ?");
        newTree.addYes(1,2,"Is the smallest person in the group taller than 1m ?");
        newTree.addYes(2,4,"Is the group size of your party less than 4 people");
        newTree.addNo(2,5,"Is the group size of your party More than 4 people?");
        newTree.addYes(4,6,"Do you like Adrnealine Rides?");
        newTree.addNo(4,7,"Do you like Adrnealine Rides?");


        newTree.addYes(6,8,"This ride is not suitable for you");
        newTree.addNo(6,9,"Do you like horror rides?");
        newTree.addYes(7,10,"This ride is not suitable for you");
        newTree.addNo(7,11,"Do you like horror rides?");


        newTree.addYes(9,12,"Do you like Kids Rides?");
        newTree.addNo(9,13,"This ride is not suitable for you");
        newTree.addYes(11,14,"Do you like Kids Rides?");
        newTree.addNo(11,15,"This ride is not suitable for you");


        newTree.addNo(12,16,"Do you like Water Rides?");
        newTree.addYes(12,17,"This ride is not suitable for you");
        newTree.addNo(14,18,"Do you like Water Rides?");
        newTree.addYes(14,19,"This ride is not suitable for you");

        newTree.addYes(16,20,"This ride is suitbale for you");
        newTree.addNo(16,21,"This ride is not suitable for you");
        newTree.addYes(18,22,"This ride is suitbale for you");
        newTree.addNo(18,23,"This ride is not suitable for you");



    }


     void queryTree() throws IOException {
        System.out.println("");
        System.out.println("Welcome to Tower Of Terror Ride. Lets see if you can ride... Answer the following questions if you dare.");
        System.out.println("");
        System.out.println("=======================================================================================================");
        newTree.queryTree();
        optionToExit();
    }


     void optionToExit() throws IOException {
        System.out.println("Exit? (enter \"Yes\" or \"No\")");
        String answer = input.readLine();
        if (answer.equals("Yes")) return;
        else {
            if (answer.equals("No")) queryTree();
            else {
                System.out.println("ERROR: Must answer \"Yes\" or \"No\"");
                optionToExit();
            }
        }
    }
}