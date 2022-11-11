package ProductCreator;

import Products.Graph;
import Products.binaryTree;

public class binaryTreeCreator implements GraphCreator{
    @Override
    public Graph factory_method() {
        return new binaryTree();
    }
}
