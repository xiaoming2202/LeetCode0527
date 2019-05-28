package Dynamics;
/*
 * һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����

������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������

���ܹ��ж�������ͬ��·����
����: m = 3, n = 2
���: 3
����:
�����Ͻǿ�ʼ���ܹ��� 3 ��·�����Ե������½ǡ�
1. ���� -> ���� -> ����
2. ���� -> ���� -> ����
3. ���� -> ���� -> ����
 * */
/*
 ����˼·��
 �ݹ鷽��:�ڴ�ռ�øߣ�����ʱ�䳬ʱ
 ��̬�滮����
 �����ڸ��ܶ�̬�滮�������Ǹ��ݹ�ȥ����Ϣ��õ�ǰ����Ϣ�����Ƚϳ���
 * */
/*
 * 
 * */

public class UniquePaths62 {
	//�ܺ�ʱ��
    public int  uniquePaths1(int m, int n) {
    	if(m==0||n==0) return 0;
        if(m==1||n==1) return 1;
        return uniquePaths1(m-1,n)+uniquePaths1(m,n-1);
    }
    //��һ�������ڴ�
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
