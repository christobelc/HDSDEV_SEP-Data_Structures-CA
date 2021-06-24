package Problem2;

import java.util.Scanner;

public class TestCases {

    public static void main(String [] args){

        //-----------Test Case 1 Hardcoded Inputs---------------------------
        System.out.println("------------ Test Case 1 - Hardcoded ---------------\n");

        Node root = new Node(5);

        Problem2 bst = new Problem2();

        Node node1 = bst.CreateNode(root, 1);
        Node node2 = bst.CreateNode(root, 8);
        Node node3 = bst.CreateNode(root, -2);
        Node node4 = bst.CreateNode(root, 6);
        Node node5 = bst.CreateNode(root, 3);
        Node node6 = bst.CreateNode(root, 9);
        Node node7 = bst.CreateNode(root, -3);
        Node node8 = bst.CreateNode(root, -1);

        /*-------------Sample Tree View-------------

					  5
					/	\
				  1 	  8
				 /  \    /  \
   			  -2	 3	6	 9
             /  \
		  -3    -1

        -------------------------------------*/
        bst.PrintLevelWise(root);
        System.out.println();

        //Sum of all leaf Nodes passing in node3
        int sum = bst.SumOfLeafNodes(node3);
        System.out.println("The sum of all the leaf nodes: " + sum +"\n");
        System.out.println();

        //-----------Test Case 2 User Input---------------------------
        System.out.println("------------ Test Case 2 - User Input --------------\n");
        Scanner scanner = new Scanner(System.in);

        Problem2 bst1 = new Problem2();
        System.out.println("User Input values for a Binary Tree: \n");

        //--User Input root Node Value--
        Node root1 = null;
        boolean valid1 = false;
        do{
            System.out.println("Enter Value for the root node: ");
            //only accept an int value
            if (scanner.hasNextInt()) {
            root1 = new Node(scanner.nextInt());
                valid1 = true;
            } else {
                scanner.next();
                System.out.println("not correct input!");
            }
        }while(!valid1);

        //-- User Input root number of nodes in BST--
        int noOfNodes=0;
        boolean valid2 = false;
        do{
            System.out.print("Please input number of nodes you want to populate the Binary Tree with: ");
            //only accept an int value
            if (scanner.hasNextInt()) {
                noOfNodes = scanner.nextInt();
                valid2 = true;
            } else {
                scanner.next();
                System.out.println("not correct input!");
            }
        }while(!valid2);

        //-- User Input of the nodes for BST --
        Node[] nodeArray = new Node[noOfNodes];
        for(int i = 0; i < nodeArray.length; i++){
            boolean valid3 = false;
            do{
                System.out.print("Please input value for Node " + (i+1) + ": ");
                //only accept an int value
                if (scanner.hasNextInt()) {
                    nodeArray[i] = bst.CreateNode(root1, scanner.nextInt());
                    valid3 = true;
                } else {
                    scanner.next();
                    System.out.println("not correct input!");
                }
            }while(!valid3);
        }
        System.out.println("All nodes successfully entered! \n");


        //-- User input of node calculate the sum --
        boolean valid4 = false;
        int nodeIndex=0;
        System.out.println("I will calculate the sum of the leaf nodes. Enter any one node from the Binary Tree: " );
        do{
            //only accept an int value
                if (scanner.hasNextInt()) {
                    int temp = scanner.nextInt();
                    for (int i = 0; i < nodeArray.length; i++) {
                      if(nodeArray[i].value == temp){
                          nodeIndex = i;
                          valid4 = true;
                          break;
                      }
                    }
                }else {
                    scanner.next();
                    System.out.println("Node with that value does not exist!");
                }
        }while(!valid4);

        //Leaf node Calculation
        int sum1 = bst1.SumOfLeafNodes(nodeArray[nodeIndex]);
        System.out.println("The sum of all the leaf nodes in the Binary Tree: " + sum1 );

    }
}
