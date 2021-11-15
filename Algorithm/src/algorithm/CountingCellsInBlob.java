package algorithm;

import java.util.ArrayList;

public class CountingCellsInBlob {
	// background pixel과 image pixel이 있을때
	// 서로 연결된 image pixel들의 집합을 blob이라고 함, 상하좌우 및 대각방향=연결된 것
	// 베이스 케이스로 현재 픽셀이 image color가 아니라면 0을 반환한다.
	/*AlogrithmforCountCells(x, y){
		if the pixel (x, y) is outside the grid
			the result is 0;
		else if pixel (x, y) is not an image pixel or already counted
			the result is 0;
		else
			set the colour of the pixel (x, y) to a red colour;
			the result is 1 plus the number of cells in each piece of
				the blob that includes a nearest neighbour;
	*/
	
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;
	
	public int countCells(int x, int y) {
		
		int grid [][] = new int[16][16];
		int N;
		
		if (x<0 || x>=N || y<0 || y>=N)
			return 0;
		else if (grid[x][y] != IMAGE_COLOR)
			return 0;
		else {
			grid[x][y] = ALREADY_COUNTED;
			return 1 + countCells(x-1, y+1) + countCells(x, y+1)
					+ countCells(x+1, y+1) + countCells(x-1, y)
					+ countCells(x+1, y) + countCells(x-1, y-1)
					+ countCells(x, y-1) + countCells(x+1, y-1);
					
		}
	}
	
}
