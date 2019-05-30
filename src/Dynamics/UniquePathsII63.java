package Dynamics;

/*
 * һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����

������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������

���ڿ������������ϰ����ô�����Ͻǵ����½ǽ����ж�������ͬ��·����



�����е��ϰ���Ϳ�λ�÷ֱ��� 1 �� 0 ����ʾ��

˵����m �� n ��ֵ�������� 100��

ʾ�� 1:

����:
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
���: 2
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
