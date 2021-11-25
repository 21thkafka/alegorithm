package algorithm;

public class Heapsort {
	//최악의 경우 시간복잡도 O(nlog2n), 추가 배열 불필요, 이진 힙 자료구조를 사용
	//complete binary tree(full이 아님)이면서 heap property를 만족해야
	//max heap property: 부모는 자식보다 크거나 값다
	//or min heap property: 부모는 자식보다 작거나 같다
	//MAX-HEAPIFY heapify: complete binary tree이면서
	//왼쪽 부트리와 오른쪽 부트리 그 자체로 힙이나 유일하게 루트만이 힙 property를 불만족한 상태
	
	/* recursion을 사용하는 경우
	 * MAX-HEAPIFY(A, i) {
	 * 	if there is no child of A[i]
	 * 		return;
	 * 	k <- index of the biggest child of i;
	 * 	if A[i] >= A[k]
	 * 		return;
	 * 	exchange A[i] and A[k];
	 * 	MAX-HEAPIFY(A, k);
	 * }
	 */

	/* iterative version
	 * MAX-HEAPIFY(A, i) {
	 * 	while A[i] has a child do
	 * 		k <- index of the biggest child of i;
	 * 		if A[i] >= A[k]
	 * 			return;
	 * 		exchange A[i] and A[k]'
	 * 		i = k;
	 * 	end
	 * }
	 */
}
