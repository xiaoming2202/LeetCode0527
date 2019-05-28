package Dynamics;
/*
 * ����һ�������Ǹ������� m x n �������ҳ�һ�������Ͻǵ����½ǵ�·����ʹ��·���ϵ������ܺ�Ϊ��С��

˵����ÿ��ֻ�����»��������ƶ�һ����
 * */
/*
 ����˼·��
 ��̬�滮���⣬ʲô�Ƕ�̬�滮��
 minPath[i][j]=min(minPath[i-1][j],minPath[i][j-1])+grid[i][j]
 ���ʽ�ӣ����������Ľ���˼·�������������е�������Ϊʲô�Ƕ�̬�滮����̫����
 �׳���㣺
 �������������������Ҫע�⡣
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

