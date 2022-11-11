import java.util.ArrayList;
import java.util.Random;

import GraphParsers.treeParser;
import Nodes.Node;
import ProductCreator.binaryTreeCreator;
import Products.Graph;
import com.sun.source.tree.BinaryTree;


public class Main {
    public static void main(String[] args) {

        Random rand = new Random(); //instance of random class
        binaryTreeCreator creator = new binaryTreeCreator();
        Graph binaryTree = creator.factory_method();
        int int_random = rand.nextInt(100);
        Node root = new Node(2,int_random);
        binaryTree.setRoot(root);

        treeParser tp = new treeParser();

        for(int i = 0 ; i < 5; i++){
            int_random = rand.nextInt(100);
            Node newNode = new Node(2,int_random);
            binaryTree.insertNode(binaryTree.getRoot(), newNode);
        }

        ArrayList<Object> output = tp.getTreeData(binaryTree.getRoot());


        System.out.println(output);
    }
}