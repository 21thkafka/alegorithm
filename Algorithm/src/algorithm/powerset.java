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
	
}
