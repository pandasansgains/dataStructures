package GraphParsers;

import Nodes.Node;

import java.awt.*;
import java.util.ArrayList;

public class treeParser {

    public treeParser(){}


    /**
     *
     * @param node the root of the tree
     * @return a representation of a tree with children hierarchy as nested array
     *
     */
    public ArrayList<Object> getTreeData(Node node){

       ArrayList<Object> branchData = new ArrayList<>();

        System.out.println("Visiting node: "+ this.getNodeRepresentation(node));
        branchData.add(this.getNodeRepresentation(node));

        if(node != null){
            for(int i =0; i < node.getChildrenCount(); i++){
                //recursion over all children
                branchData.add(getTreeData(node.getChild(i)));
            }
        }

        //System.out.println(branchData);
        return branchData;

    }

    public String getNodeRepresentation(Node node){
        if(node == null){
            return "-";
        }
        else{
            return Integer.toString(node.getNodeData());
        }
    }







}
