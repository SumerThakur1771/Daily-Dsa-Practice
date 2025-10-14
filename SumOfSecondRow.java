public class SumOfSecondRow {

    public static void SecondRowSum(int nums[][]){
        int sum = 0;
        for(int j = 0; j < nums.length; j++){
            sum += nums[1][j];
        }
        System.out.println(sum);
    }
    public static void main(Strings[] args) {
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        SecondRowSum(nums);
    }
}
