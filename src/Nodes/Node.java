package Nodes;
import java.util.ArrayList;

public class Node {

    public ArrayList<Node> children;
    private int nodeData;
    private int childrenCount;

    class notAChildException extends Exception{
        public notAChildException(String s){
            super("Trying to insert a child at an index unsupported by the Node" + " " + s);
        }
    }

    public Node(int childrenCount, int nodeData){

        this.children = new ArrayList<>();

        for(int i = 0 ; i < childrenCount; i++){
            children.add(null); // adding childrenCount slots
        }

        this.childrenCount = childrenCount;
        this.nodeData = nodeData;
    }

    /**
     *
     * @param childIndex the index where we want to insert given child
     * @param child the child node
     * @return true if we can insert false if we try to insert outside the childrange
     */
    public boolean setChild(int childIndex, Node child){

        //TODO verify if the datatype matches the node's datatype
        boolean valid = validChild(childIndex);
        if(valid){
            this.children.set(childIndex, child);
        }
        return valid;
    }

    public Node getChild(int childIndex){

        boolean valid = validChild(childIndex);

        if(!valid){
            try{
                throw new notAChildException("");
            }
            catch(notAChildException ex){

                System.out.println(ex.getMessage());

            }
        }

        return this.children.get(childIndex);

    }

    // TODO When extending node to abstract class we can then change the type of nodes

    public void setData(int value){
        this.nodeData = value;
    }

    public boolean validChild(int childIndex){

        if((childIndex - 1) < childrenCount && childIndex >= 0){
            return true;
        }
        return false;
    }

    public int getChildrenCount(){
        return this.childrenCount;
    }

    public int getNodeData(){
        return this.nodeData;
    }


}
