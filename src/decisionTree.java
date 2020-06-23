
import java.io.*;

class DecisionTree {



    private static class Tree {

        private int node;
        private String qOrA;
        private Tree yes = null;
        private Tree no = null;


        public Tree(int node, String qOrA) {
            this.node = node;
            this.qOrA = qOrA;

        }
    }

    static BufferedReader input = new
            BufferedReader(new InputStreamReader(System.in));
    Tree root = null;


    public DecisionTree() {
    }




    public void createRoot(int node, String qOrA) {
        root = new Tree(node, qOrA);
    }






    public void addYes(int existingNodeID, int node, String qOrA) {


        if (root == null) {
            System.out.println(" No root node!");
            return;
        }


        if (searchTreeAddYes(root,existingNodeID,node,qOrA)) {
//            System.out.println("Added node " + node +
//                    " onto \"yes\" branch of node " + existingNodeID);
        }
        else System.out.println("Node " + existingNodeID + " not found");
    }


    private boolean searchTreeAddYes(Tree currentNode,
                                     int existingNodeID,int node, String qOrA) {
        if (currentNode.node == existingNodeID) {
            if (currentNode.yes == null) currentNode.yes = new Tree(node, qOrA);
            else {
                System.out.println("Overwriting previous node " +

                        "(id = " + currentNode.yes.node +
                        ") Connected to yes branch of node " +
                        existingNodeID);
                currentNode.yes = new Tree(node, qOrA);
            }
            return(true);
        }
        else {

            if (currentNode.yes != null) {
                if (searchTreeAddYes(currentNode.yes,
                        existingNodeID,node,qOrA)) {
                    return(true);
                }
                else {
                    if (currentNode.no != null) {
                        return(searchTreeAddYes(currentNode.no,
                                existingNodeID,node,qOrA));
                    }
                    else return(false);
                }
            }
            return(false);
        }
    }



    public void addNo(int existingNodeID, int node, String newQuestAns) {


        if (root == null) {
            System.out.println("ERROR: No root node!");
            return;
        }



        if (searchTreeAddNo(root,existingNodeID,node,newQuestAns)) {
//            System.out.println("Added node " + node +
//                    " onto \"no\" branch of node " + existingNodeID);
        }
        else System.out.println("Node " + existingNodeID + " not found");
    }


    private boolean searchTreeAddNo(Tree currentNode,
                                    int existingNodeID, int node, String newqOrA) {
        if (currentNode.node == existingNodeID) {
            // Found node
            if (currentNode.no == null) currentNode.no = new Tree(node, newqOrA);
            else {
                System.out.println("WARNING: Overwriting previous node " +
                        "(id = " + currentNode.no.node +
                        ") linked to yes branch of node " +
                        existingNodeID);
                currentNode.no = new Tree(node, newqOrA);
            }
            return(true);
        }
        else {
            if (currentNode.yes != null) {
                if (searchTreeAddNo(currentNode.yes,
                        existingNodeID,node,newqOrA)) {
                    return(true);
                }
                else {
                    if (currentNode.no != null) {
                        return(searchTreeAddNo(currentNode.no,
                                existingNodeID,node,newqOrA));
                    }
                    else return(false);
                }
            }
            else return(false);
        }
    }



    public void queryTree() throws IOException {
        queryTree(root);
    }

    private void queryTree(Tree currentNode) throws IOException {


        if (currentNode.yes ==null) {
            if (currentNode.no ==null) System.out.println(currentNode.qOrA);
            else System.out.println("Error: Missing \"Yes\" branch at \"" +
                    currentNode.qOrA + "\" question");
            return;
        }
        if (currentNode.no ==null) {
            System.out.println("Error: Missing \"No\" branch at \"" +
                    currentNode.qOrA + "\" question");
            return;
        }


        askQ(currentNode);
    }

    private void askQ(Tree currentNode) throws IOException {
        System.out.println(currentNode.qOrA + " (enter \"Yes\" or \"No\")");
        String answer = input.readLine();
        if (answer.equals("Yes")) queryTree(currentNode.yes);
        else {
            if (answer.equals("No")) queryTree(currentNode.no);
            else {
                System.out.println("ERROR: Must answer \"Yes\" or \"No\"");
                askQ(currentNode);
            }

        }
    }




    public void outputTree() {

        outputTree("1", root);
    }

    private void outputTree(String tag, Tree currentNode) {


        if (currentNode == null) return;


        System.out.println("[" + tag + "] nodeID = " + currentNode.node +
                ", question/answer = " + currentNode.qOrA);


        outputTree(tag + ".1",currentNode.yes);


        outputTree(tag + ".2",currentNode.no);
    }
}
