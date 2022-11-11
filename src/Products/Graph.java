package Products;

import Nodes.Node;

import java.util.HashMap;
import java.util.Map;

public abstract class Graph {

    Node root;
    Map<String, Node> nodeList;


    public Graph(){
        this.root = null;
        this.nodeList = new HashMap<>();
    }

    //  blueprint of a datastructure
    public abstract boolean insertNode(Node parent,  Node newNode);

    public abstract void removeNode(int nodeIndex);

    public abstract Node getNode(int nodeIndex);

    public Node getRoot(){
        return this.root;
    }

    public void setRoot(Node newNode){
        this.root = newNode;
    }

    public abstract boolean validNode(Node newNode);








}
