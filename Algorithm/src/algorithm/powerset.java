package algorithm;

public class powerset {
	//멱집합: n을 포함하는 모든 부분집합  
	//a를 포함x=a를 포함한 부분집합 결국 a를 제외하거나 반드시 포함하나 결국 나머지 것들의 부분집합 개수
	/*
	 * powerSet(S)
	 * if S is an empty set	// 만약 공집합이면 아무것도 출력 않하고 끝냄
	 * 	print nothing;
	 * else
	 *  let t be the first element of S;
	 * 	find all subsets of S-{t} by calling powerSet(S-{t});
	 * 	print the subsets;
	 * 	print the subsets with adding t;	// 부분 집합들을 한번에 return 해야하는데 간단한 문제가 아님
	 */
	/*
	 * 위 설계는 멱집합을 출력하기 여려우므로 다음과 같이 설계해야함.
	 * Recursion 함수가 두 개의 집합을 매개변수로 받도록 설계해야 한다는 의미. 
	 * 두 번째 집합의 모든 부분 집합들에 첫번쨰 집합을 합집합하여 출력한다.
	 *powerSet(P, S)
	 *if S is an empty set
	 *	print P;
	 *else
	 *	let t be the first element of S;
	 *	powerSet(P, S-{t}); t를 표함하지 않은 부분집합들
	 *	powerSet(PU{t}, S-{t}); t를 포함하는 부분집합들
	 */
	
	private static char data [] = {'a', 'b', 'c', 'd', 'e', 'f'};
	private static int n=data.length;
	private static boolean [] include = new boolean [n];
	
	public static void powerSet(int k) {
		if (k==n) {
			for (int i=0; i<n; i++)
				if (include[i]) System.out.print(data[i] + " ");
			System.out.println();
			return;
		}
		include[k]=false;	//k를 포함하지 않는 경우
		powerSet(k+1);
		include[k] = true;	//k를 포함하는 경우
		powerSet(k+1);
	}
}
