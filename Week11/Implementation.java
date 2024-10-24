package Week11;

public class Implementation {
    public static void main(String[] args) {
        BinaryTrees bt=new BinaryTrees();
        //if no default constructor
        //bt.root=bt.CreateTree();
        bt.Display();
        System.out.println();
        System.out.println();
        System.out.println(bt.findMax(bt.root));
        System.out.println(bt.findElement(bt.root, 4));
        System.out.println(bt.treeHeight(bt.root));
        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);
        System.out.println();
    }   
}