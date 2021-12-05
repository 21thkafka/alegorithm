package algorithm;

public class binaryTreeInorder {
	/*x를 루트로 하는 트리를 inorder 순회, 시간복잡도 O(n)
	 * INORDER-TREE-WALK(x)
	 * if x != NIL :null
	 * 	then INORDER-TREE-WALK(left[x])
	 * 		print key[x]
	 * 		INORDER-TREE-WALK(right[x])
	 * 
	 * PREORDER-TREE-WALK(x)
	 * 	if x != NIL
	 * 		then print key[x]
	 * 			PRE-ORDER-TREE-WALK(left[x])
	 * 			PRE-ORDER-TREE-WALK(right[x])
	 * 
	 *  PostORDER-TREE-WALK(x)
	 * 	if x != NIL
	 * 		then PRE-ORDER-TREE-WALK(left[x])
	 * 			 PRE-ORDER-TREE-WALK(right[x])
	 * 			 print key[x]
	 *
	 *LEVEL-ORDER-TREE-TRAVERSAL()
	 *	visit the root;
	 *	Q<-root;
	 *	while Q is not empty do
	 *		v <- dequeue(Q);
	 *		visit children of v;
	 *		enqueue children of v into Q;
	 *	end.
	 *end. 
	 */
}
