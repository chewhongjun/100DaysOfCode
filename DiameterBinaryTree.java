static int diameter=0;

private static int diameter(Node root){
    if(root == null) return 0;
    int lRadius = diameter(root.left);
    int rRadius = diameter(root.right);
    diameter = Math.max(lRadius+rRadius,diameter);
    return Math.max(lRadius, rRadius)+1;
}