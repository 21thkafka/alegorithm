package algorithm;

public class BinarySearchTree {
	//Dynamic Set, Dictionary, Search Structure라고 하기도 함
	//각 노드 v에 대해서 그 노드의 왼쪽 부트리(subtree)에 있는 키들은 key[v]보다 작거나 같고, 오른쪽 부트리에 있는 값은 크거나 같다.
	/* 리커전을 사용하는 경우
	 * TREE-SEARCH(x, k)
	 * 	if x = NIL or k = key[x]
	 * 		then return x
	 * 	if k < key[x]
	 * 		then return TREE-SEARCH(left[x],k)
	 * 		else return TREE-SEARCH(right[x],k)
	 */
	/*
	 * 반복문을 사용하는 경우
	 * Iteraive Version
	 * ITERATIVE-TREE-SEARCH(x,k)
	 * 	while x != NIL and k != key[x]
	 * 		do if k<key[x]
	 * 			then x <- left[x]
	 * 			else x <- right[x]
	 * 	return x
	 */
	
}
