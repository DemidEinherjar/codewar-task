package SnailSort;

public class Snail {
    public static int[] snail(int[][] array) {
        int i, m = array.length, n = array[0].length, index = 0, c = 0, l = 0;
        int[] result = new int[m * n];
        if(array == null) return result;
        while(c < m && l < n){
            for(i = l; i < n ; ++i){
                result[index++] = array[c][i];
            }
            c++;
            for(i = c; i < m; ++i){
                result[index++] = array[i][n-1];
            }
            n--;
            if(c < m){
                for( i = n - 1; i >= l; --i){
                    result[index++] = array[m -1][i];
                }
            }
            m--;
            if(l < n){
                for(i = m - 1; i >= c; --i){
                    result[index++] = array[i][l];
                }
            }
            l++;
        }
        return result;
    }
}