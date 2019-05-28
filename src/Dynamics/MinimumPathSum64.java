package Dynamics;
/*
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

说明：每次只能向下或者向右移动一步。
 * */
/*
 解题思路：
 动态规划的题，什么是动态规划？
 minPath[i][j]=min(minPath[i-1][j],minPath[i][j-1])+grid[i][j]
 这个式子，就是这道题的解题思路。看起来倒是有道理，但是为什么是动态规划，不太懂。
 易出错点：
 数组的行索引和列索引要注意。
 * */
public class MinimumPathSum64 {
    public static int minPathSum(int[][] grid) {
    	if(grid.length==0||grid[0].length==0)
    		return 0;
    	int m=grid[0].length;
    	int n=grid.length;
    	for(int i=1;i<m;i++){
    		grid[0][i]=grid[0][i-1]+grid[0][i];
    	}
    	for(int j=1;j<n;j++){
    		grid[j][0]=grid[j-1][0]+grid[j][0];
    	}
    	for(int i=1;i<m;i++){
    		for(int j=1;j<n;j++) {
    			grid[j][i]=Math.min(grid[j][i-1], grid[j-1][i])+grid[j][i];
    		}
    	}
    	return grid[n-1][m-1];
    }
    public static void main(String []args) {
    	/*int [][] arr= {
    			  {1,3,1},
    			  {1,5,1},
    			  {4,2,1}
    			  };*/
    	int [][] arr= {
  			  {1,2,5},
  			  {3,2,1}
  			  };
    	int res=minPathSum(arr);
    	System.out.println(res);
    }
}

