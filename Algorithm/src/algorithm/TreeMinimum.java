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
	//predecessor : 노드 x의 predecessor란 key[x]보다 작으면서 가장 큰 키를 가진 노드, successor의 반대
	
	//Insert
	/* z가 insert할 노드
	 * TREE-INSERT(T, z)
	 * 	y <- NIL
	 * 	x <- root[T]
	 * 	while x != NIL
	 * 		do y <- x
	 * 			if key[z] < key[x]
	 * 				then x <- left[x]
	 * 				else x <- right[x]
	 * 	p[x] <- y
	 * 	if y = NIL
	 * 		then root[T] <- z empty tree의 경우 z가 root가 됨
	 * 		else if key[z] < key[y]
	 * 			then left[y] <- z
	 * 			else right[y] <- z
	 */
	
	//DELETE : SEARCH를 하고 삭제
	//자식 노드가 없거나 자식 노드, 부모노드가 한개씩 있는 경우는 간단.
	//그러나 자식노드가 2개인 경우 일단 데이터만 삭제하고 삭제한 데이터의 predecessor나 successor를 copy한다.
	/*
	 *TREE-DELETE(T, z)
	 *	if left[z] = NIL or right[z] = NIL 자식 노드가 없는경우
	 *		then y <- z
	 *		else y <- TREE-SUCCESSOR(z)
	 * if left[y] != NIL
	 * 		then x <- left[y]
	 * 		else x <- right[y]
	 * 	if x != NIL
	 * 		then p[x] <- p[y]
	 * 	if p[y] = NIL
	 * 		then root[T] <- x
	 * 		else if y = left[p[y]]
	 * 			then left[p[y]] <- x
	 * 			else right[p[y]] <- x
	 * 	if y != z
	 * 		then key[z] <- key[y]
	 * 			copy y's staellite data into z
	 * 	return y
	 * 
	 */
}

