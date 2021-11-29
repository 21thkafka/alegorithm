package algorithm;

public class SortingInLinearTime {

	//Counting Sort : n개의 정수를 정렬하라. 단 모든 정수는 0에서 k(사전지식)사이의 정수이다.
	//key값이기 때문에 누적합을 구하여 그 자리에 배치(예: 3이 3보다 작거나 같은 것이 7개만 7자리에 배치)
	/*
	 * Counting-Sort(A, B, k)
	 * 	for i <- () to k
	 * 		do C[i] <- 0
	 * 	for j <- 1 to length[A]
	 * 		do C[A[j]] <- C[A[j]] + 1
	 * 	for i <- 1 to k
	 * 		do C[i] <- C[i] + C[i-1] 누적합
	 * 	for j <- length[A] downto 1
	 * 		do B[C[A[j]]] <- A[j]
	 * 			C[A[j]] <- C[A[j]] - 1
	 */
	//k가 클 경우 비실용적, Stable 정렬 알고리즘
}
