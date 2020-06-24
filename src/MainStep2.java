
import java.io.IOException;
        import java.util.Scanner;

public class MainStep2 {


    public static void main(String[] args) throws IOException {

        System.out.println("\nWelcome to Time Travellers.");
        System.out.println("\n");

        boolean finished = false;

        Scanner scanner = new Scanner(System.in);
        DecisionTreeMain1 decisionTreeMain1 = new DecisionTreeMain1();
        DecisionTreeSingle decisionTreeSingle = new DecisionTreeSingle();
        DecisionTreeWhole decisionTreeWhole = new DecisionTreeWhole();
        Recommendations reccommendations = new Recommendations();

        do {

            System.out.println("\nChoose an Option:");
            System.out.println();
            System.out.println("\n1. Get Your Recomendations for a single ride");
            System.out.println("2. Get your recomendations for the entire park");
            System.out.println("3.Quit");
            System.out.println();
            System.out.println(">>>");
            System.out.println(">>>");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    decisionTreeMain1.Questions(scanner);
                    decisionTreeSingle.queryTree();
                    reccommendations.ReccomendationsForUser();
                    break;

                case"2":
                    decisionTreeMain1.Questions(scanner);
                    decisionTreeWhole.queryTree();

                case "3":
                    finished = true;
                    System.out.println("Goodbye");
                    break;
            }
        } while (!finished);
        System.out.println("Goodbye");
    }
}
