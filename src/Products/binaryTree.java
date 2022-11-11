package Products;

import Nodes.Node;

import java.util.HashMap;
import java.util.Map;

public class binaryTree extends Graph{


    public binaryTree(){
        super();
    }


    @Override
    public boolean insertNode(Node parent, Node newNode) {

        if(this.root == null){
            //TODO throw no root Exception
            return false;
        }

        if(validNode(newNode)){
            // parent is more than children we go left
            if(parent.getNodeData() > newNode.getNodeData()) {
                Node leftChild = parent.getChild(0);
                if(leftChild == null){
                    parent.setChild(0,newNode);
                    System.out.println("Inserted node with value: "+ newNode.getNodeData());
                    return true;
                }
                //preform recursion
                return this.insertNode(leftChild, newNode);
            }
            // parent is less than children we go right
            else{
                Node rightChild = parent.getChild(1);
                if(rightChild == null){
                    parent.setChild(1,newNode);
                    System.out.println("Inserted node with value: "+ newNode.getNodeData());
                    return true;
                }
                //preform recursion
                return this.insertNode(rightChild, newNode);
            }
        }
        //smt went wrong in the insertion process
        return false;

    }

    @Override
    public void removeNode(int nodeIndex) {

    }

    @Override
    public Node getNode(int nodeIndex) {
        return null;
    }


    @Override
    public void setRoot(Node newNode) {

        this.nodeList.put("0 0",newNode);
        // first number is level second number is index of parent, second is index of children with root starting at 0
        //TODO implement the hierarchy of the indexes for the map

        this.root = newNode;
    }

    // TODO implement later for checking that the given node has
    // 1 right amount of children
    // 2 right type
    @Override
    public boolean validNode(Node newNode) {

        //TODO get type of Node and make sure it matches type of tree
        //if((newNode.getNodeData().getClass().getName().equals('') ))

        if(newNode.getChildrenCount() == 2){
            return true;
        }
        return false;
    }


}
