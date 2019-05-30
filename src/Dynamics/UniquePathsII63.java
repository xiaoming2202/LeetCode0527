package Dynamics;

/*
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？



网格中的障碍物和空位置分别用 1 和 0 来表示。

说明：m 和 n 的值均不超过 100。

示例 1:

输入:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
输出: 2
 * */
public class UniquePathsII63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0)
			return 0;

		int hang = obstacleGrid.length;
		int lie = obstacleGrid[0].length;
		int[][] path = new int[obstacleGrid.length][obstacleGrid[0].length];
		for (int i = 0; i < hang; i++) {
			for (int j = 0; j < lie; j++) {
				if (i == 0 || j == 0)
					path[i][j] = 1;
				else {
					path[i][j] = obstacleGrid[i - 1][j] == 0 ? path[i - 1][j]
							: 0 + obstacleGrid[i][j - 1] == 0 ? path[i][j - 1] : 0;
				}
			}
		}

		return path[hang-1][lie-1];
	}
	public static  void main(String []args) {
		int [][]input= {
				{0,0,0},
				{0,1,0},
				{0,0,0}
		};
		int res=new UniquePathsII63().uniquePathsWithObstacles(input);
		System.out.println(res);
	}
}
