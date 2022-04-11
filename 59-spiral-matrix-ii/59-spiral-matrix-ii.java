class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int start = 1,  end = n*n; //开始和结束的范围
        int l = 0,  t = 0,  r = n-1,  b = n-1; //左上右下边界
        
        //int在同一行上 只写一次int 用,逗号隔开
        while(start <= end) {
            for(int i = l; i <= r; i++) mat[t][i] = start++;//从左到右
            t++;
            for(int i = t; i <= b; i++) mat[i][r] = start++;//从上到下
            r--;
            for(int i = r; i >= l; i--) mat[b][i] = start++;//从右到左
            b--;
            for(int i = b; i >= t; i--) mat[i][l] = start++;//从下到上
            l++;
        }
        return mat;
    }
}