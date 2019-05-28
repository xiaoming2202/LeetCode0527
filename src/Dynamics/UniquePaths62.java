package Dynamics;
/*
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

问总共有多少条不同的路径？
输入: m = 3, n = 2
输出: 3
解释:
从左上角开始，总共有 3 条路径可以到达右下角。
1. 向右 -> 向右 -> 向下
2. 向右 -> 向下 -> 向右
3. 向下 -> 向右 -> 向右
 * */
/*
 解题思路：
 递归方法:内存占用高！而且时间超时
 动态规划方法
 现在在感受动态规划，好像是根据过去的信息获得当前的信息？？比较抽象
 * */
/*
 * 
 * */

public class UniquePaths62 {
	//很耗时间
    public int  uniquePaths1(int m, int n) {
    	if(m==0||n==0) return 0;
        if(m==1||n==1) return 1;
        return uniquePaths1(m-1,n)+uniquePaths1(m,n-1);
    }
    //有一点消耗内存
    public int  uniquePaths2(int m, int n) {
    	int [][]path=new int [m][n];
    	if(m==0||n==0) return 0;
        if(m==1||n==1) return 1;
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++) {
        		if(i==0|j==0)
        			path[i][j]=1;
        		else
        		path[i][j]=path[i-1][j]+path[i][j-1];
        	}
        }
        return path[m-1][n-1];
    }
    public static void main(String [] args) {
    	int res1=new UniquePaths62().uniquePaths1(7,3);
    	int res2=new UniquePaths62().uniquePaths2(7,3);

    	System.out.println("res1="+res1+" res2="+res2);
    }
}
