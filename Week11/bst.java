package Week11;
//binary search tree always sorted array
public class bst {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private static Node root;
    public bst(int[] arr){ //sorted array
        root=createTree(arr,0,arr.length-1);
    }
    private Node createTree(int[] arr,int low,int high){
        if(low>high) return null;
        Node nn=new Node();
        int mid=(low+high)/2;
        nn.val=arr[mid];
        nn.left=createTree(arr, low, mid-1);
        nn.right=createTree(arr, mid+1, high);
        return nn;
    }
    public void Display(){
        Display(root);
    }
    public static void Display(Node nn){
        if(nn==null) return;
        String s="";
        s="<--"+nn.val+"-->";
        if(nn.left!=null){
            s=nn.left.val+s;
        }
        else{
            s="Null"+s;
        }
        if(nn.right!=null){
            s+=nn.right.val;
        }
        else{
            s+=" Null";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        bst BST=new bst(arr);
        BST.Display(root);
    }
}
