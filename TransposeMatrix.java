public class TransposeMatrix {

    public static int[][] Transpose(int nums[][]){
        int rows = nums.length, cols = nums[0].length;
        int [][] t = new int [cols][rows];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                t[j][i] = nums [i][j];
            }
        }
        return t;
    }
    public static void main(Strings[] args) {
        int nums[][]= {{2,3,5},{6,8,9}};
        int t [][] = Transpose(nums);
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[0].length; j++){
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
    }
}
