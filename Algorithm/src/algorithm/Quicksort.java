package algorithm;

public class Quicksort {
	//분할정복법: 분할-정복-합병
	//분할: 배열을 pivot보다 큰 값과 작은 값이라는 조건이 만족되도록 두 부분으로 나눈다 -> 
	//정복: 각 부분을 순환적으로 정렬한다 ->합병
	/*
	 * quickSort(A[], p, r)
	 * {
	 * 		if (p<r) then {
	 * 			q = partition(A, p, r);
	 * 			quickSort(A, p, q-1);
	 * 			quickSort(A, q+1, r);
	 * 		}
	 * }
	 * partition(A[], p, r)
	 * {
	 * 		배열 A[p...r]의 원소들은 A[r]을 기준으로 양쪽으로 재배치하고
	 * 		A[r]이 자리한 위치를 return 한다;
	 * }
	 */
	
	/*
	 * i: pivot보다 작은 값들 중 마지막 값/ j:지금 검사하려는 값
	 * if A[j]>=x
	 * 	j<-j+1;
	 * else
	 * 	i<-i+1;
	 * exchange A[i] and A[j];
	 * j<-j+1;
	 */
	/*
	 * Partition(A, p, r){
	 * 	X<-A[r];
	 * 	i<-p-1;
	 * 	for j<-p to r-1
	 * 	if A[j] <= x then
	 * 		i<-i+1;
	 * 		exchange A[i] and A[j]'
	 * 	exchange A[i+1] and A[r]'
	 * 	return i+1;
	 * 
	 */
}
