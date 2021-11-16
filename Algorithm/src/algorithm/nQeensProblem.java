package algorithm;

public class nQeensProblem {
	//Backtracking : 문제에 막다른 곳에 다다르면 이전에 내린 결정으로 되돌아가 번복하는 방법 recursion/stack으로 구현
	//상태공간트리 : 상태공간트리란 차는 해를 포함하는 트리.
	//즉 해가 존재한다면 그것은 반드시 이 트리의 어떤 한 노드에 해당함. 
	//따라서 이 트리를 체계적으로 탐색하면 해를 구할 수 있음, 그러나 다 탐색할 필요는 없음
	//깊이 우선 탐색
	/*
	 * return-type queens(arguments){ (매개변수는 내가 현재 트리의 어떤 노드에 있는지를 지정
	 * if non-promising (꽝)				혹은 전역 변수를 지정해서 이용할 수도 있다  )
	 * 	report failure and return;
	 * else if success 답인 경우
	 * 	report answer and return; 
	 * else 꽝도 아니고 답도 아닌 경우 되돌아가야하는 경우
	 * 	visit children recursively;
	 * 
	 */
	
	
	int [] cols = new int [N+1]; 	//전역변수
	boolean queens(int level) { 	//트리의 레벨
		if (!promising(level))
			return false;
		else if (level==N)
			for (int i=1; i<=N; i++)
				System.out.println("(" + i + ", " + cols[i] + ")");
			return true;
		for (int i=1; i<=N; i++){
			cols[level+1] = i;
			if(queens(level+1))
				return true;
		}
		return false;
	}
	
	//promising(level) : 어차피 앞서 놓은 말들끼리 충돌하지 않다는 것이 확실하므로 
		//					마지막 놓은 말이 이전에 놓인 다른 말과 충돌하는지만 검사해도 충분
	boolean promising(int level) {
		for (int i=1; i<level; i++) {
			if(cols[i]==cols[level])	//같은 열에 놓였는지 검사
				return false;
			else if (level-i==Math.abs(cols[level]-cols[i]))	//같은 대각선에 놓였는지 검사
				return false;
		}
		return true;
		}
	
	
}
