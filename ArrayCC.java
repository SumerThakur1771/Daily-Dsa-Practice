public class ArrayCC {
    public static int Largest(int nums[]){
        int largest  = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int nums[]= {4,5,6,7,0,1,2};
        System.out.println(Largest(nums));
    }
}
