package algorithm;

public class sequentialSearch {

	int search(int [] data, int n, int target) {
		for (int i=0; i<n; i++)
			if (data[i]==target)
				return i;
		return -1;
	}
	
	//리커전으로 구현
	int rSearch(int [] data, int begin, int end, int target) {
		if (begin>end)	// 데이터가 0 개
			return -1;
		else if (target==data[begin])	//데이터가 1개
			return begin;
		else return rSearch(data, begin+1, end, target);	//자기자신 함수로 돌아와 반복
	}

	//리커전 다른 버전, 끝에서부터 시작하는 역방향
	int rSearch2(int [] data, int begin, int end, int target) {
		if (begin>end)
			return -1;
		else if (target == data[end])
			return end;
		else return rSearch2(data, begin, end-1, target);
	}

	//리커전의 또다른 버전, 중간에서 시작하는 방법
	int mSearch(int [] data, int begin, int end, int target) {
		if (begin>end) {
			return -1;
		} else {
				int middle = (begin+end)/2;
				if(data[middle]==target)
					return middle;
				int index = mSearch(data, begin, middle-1, target);
				if(index != -1)
					return index;
				else
					return mSearch(data, middle+1, end, target);
			}
		}
	//최대값 찾기
	int findMax(int [] data, int begin, int end) {
		if(begin==end)
			return data[begin];
		else
			return Math.max(data[begin], findMax(data, begin+1, end));
	}

}
