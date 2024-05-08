public class binary_tree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    public static class btree
    {
        static int idx = -1;
        public Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node nn= new Node(nodes[idx]);
            nn.left= nodes[idx+1]!= -1? buildtree(nodes) : null;
            nn.right= nodes[idx+2]!= -1 && nn.left!= null? buildtree(nodes) : null;
            return nn;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,-1,2,1,4,5,4,5,6,5,3,2,1};
        btree tree= new btree();
        Node root= tree.buildtree(nodes);
        System.out.println(root.left.data);
    }
}