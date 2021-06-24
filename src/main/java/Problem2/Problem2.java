package Problem2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem2 implements P2Interface{

    // Sum of all leaf nodes from any given node in the tree
    @Override
    public int SumOfLeafNodes(Node node){
        Node root = GetRoot(node);
        return FromRootSumOfLeafNodes(root);
    }

    // Sum of leaf nodes when the root is passed
    @Override
    public int FromRootSumOfLeafNodes(Node root){
        if (root == null){
            return 0;
        }
        // if no left or right children we are at the leaf node
        if (root.left == null && root.right == null){
            return root.value;
        }else{
            // recursively call the left and right side of the tree, sum up
            return FromRootSumOfLeafNodes(root.left) + FromRootSumOfLeafNodes(root.right);
        }
    }

    // Find the root from any node
    @Override
    public Node GetRoot(Node node){
        if (node.parent == null){
            return node;
        }else{
            // root node has no parent recursively search until we find it
            return GetRoot(node.parent);
        }
    }

    // Adds node to the BST,
    @Override
    public Node CreateNode(Node node, int value){
        // if less than value of root
        if (value < node.value){
            if (node.left != null){
                // look to the next node
                return CreateNode(node.left, value);
            }else{
                // if null add to the left side
                return node.left = new Node(value, node);
            }
        }else{
            // if greater than value of the root
            if (node.right != null){
                // look to the right side of the node
                return CreateNode(node.right, value);
            }else{
                // if null add to the right
                return node.right = new Node(value, node);
            }
        }
    }


    // -------------Clive's code for searching the BST ---------------------
    public boolean SearchTree(Node root, int value){
        return SearchTreeRecursively(root, value );
    }

    public boolean SearchTreeRecursively(Node current, int value){
        if (current == null){
            return false;
        }
        if(current.value == value){
            return true;
        }
        if (value < current.value){
            return SearchTreeRecursively(current.left, value);
        }else{
            return SearchTreeRecursively(current.right, value);
        }
    }


    //-------------Clive's code for printing and traversing the BT------------
    public void PrintLevelWise(Node root)
    {
        // TODO Auto-generated method stub
        Queue<Node> nodes= new LinkedList<>();

        List<Node> listOfNodes = new ArrayList<Node>();
        //add root to the list
        TraverseLevels(root, listOfNodes,nodes);
        //printing in a straight line
        //System.out.println("nodes are "+listOfNodes);
        // printing level wise
        int count = 0,level=0;

        while (count < listOfNodes.size()){
            int printLen= (int) Math.pow(2, level++);

            for (int i=count; i < printLen -1 && i < listOfNodes.size();++i){
                System.out.print(listOfNodes.get(i).value+" ");
            }
            System.out.println();
            count = printLen-1;
        }
    }

    public void TraverseLevels(Node root, List<Node> listOfNodes, Queue<Node> nodes)
    {
        // TODO Auto-generated method stub
        if (root!=null){

            nodes.add(root);
            listOfNodes.add(root);
            while(!nodes.isEmpty()){

                //standard BFS
                root= nodes.poll();
                if (root.left!=null) {
                    listOfNodes.add(root.left);
                    nodes.add(root.left);
                }
                if (root.right!=null) {
                    listOfNodes.add(root.right);
                    nodes.add(root.right);
                }
            }

        }
    }
}
