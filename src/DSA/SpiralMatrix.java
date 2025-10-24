package DSA;
import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //System.out.println(spiralOrder(matrix));
        int[][] ans = spiralOrder1(3);
        System.out.println(Arrays.deepToString(ans));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while(top<=bottom && left<=right){
            for(int j = left;j <= right; j++){
                arr.add(matrix[top][j]);
            }
            top++;

            for(int j = top;j <= bottom; j++){
                arr.add(matrix[j][right]);
            }
            right--;

            if(top<=bottom) {
                for (int j = right; j >= left; j--) {
                    arr.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if(left<=right) {
                for (int j = bottom; j >= top; j--) {
                    arr.add(matrix[j][left]);
                }
                left++;
            }
        }
        return arr;
    }

    public static int[][] spiralOrder1(int n) {
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int i = 1;
        while(top<=bottom && left<=right){
            for(int j = left;j <= right; j++){
                mat[top][j] = i++;
            }
            top++;

            for(int j = top;j <= bottom; j++){
                mat[j][right] = i++;
            }
            right--;

            if(top<=bottom) {
                for (int j = right; j >= left; j--) {
                    mat[bottom][j] = i++;
                }
                bottom--;
            }

            if(left<=right) {
                for (int j = bottom; j >= top; j--) {
                    mat[j][left] = i++;
                }
                left++;
            }
        }
        return mat;
    }
}
