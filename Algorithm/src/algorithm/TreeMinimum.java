package algorithm;

public class TreeMinimum {
	//이진검색트리-최소값
	/*최소값은 항상 가장 왼쪽 노드에 존재
	 * TREE-MINIMUM(x)
	 * 	while left[x] != NIL
	 * 		do x<-left[x]
	 * 	return x
	 */
	//최대값-최소값에 반대, 가장 오른쪽 노드에 존재
	/*
	 * TREE-MAXIMUM(x)
	 * 	while right[x] != NIL
	 * 		do x <- right[x]
	 * 	return x
	 */
	
	//Successor : 노드 x의 successor란 key[x]보다 크면서 가장 작은 키를 가진 노드, 모든 키들이 서로 다르다고 가정
	/*
	 * TREE-SUCCESSOR(x)
	 * 	if right[x] != NIL
	 * 		then return TREE-MINIMUM(right[x])
	 * 	y <- p[x] p는 x의 부모
	 * 	while y != NIL and x =right [y]
	 * 		do x <- y
	 * 			y <- p[y]
	 * 	return y
	 * 
	 */
}

