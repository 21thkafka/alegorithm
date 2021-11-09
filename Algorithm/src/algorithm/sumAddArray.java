package algorithm;


public class sumAddArray {

	public static int sum(int n, int [] data) {
		if (n<=0)
			return 0;
		else
			return sum(n-1, data) + data[n-1];
	}
	// 모든 반복문은 recursion(순환함수)으로 표현 가능함
	//복잡한 알고리즘을 순환함수는 단순하고 알기 쉽게 표한할 수 있음, 그러나 오버해드 따름
	
}
