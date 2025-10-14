public class SingleNumber {

    // public static int findNumber(int nums[]){
    //     int uniqueNum = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         boolean isthere = false;
    //         for(int j = 0; j < nums.length; j++){
    //             if(i == j){
    //                 continue;
    //             }
    //             if(nums[i] == nums[j]){
    //                 isthere = true;
    //                 break;
    //             }
    //         }
    //         if(isthere == false){
    //              uniqueNum =  nums[i];
    //              break;
    //         }

    //     }
    //     return uniqueNum;
    // }

    //better approach using XOR logic
    public static int uniqueNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
    public static void main(Strings[] args) {
        int nums[] = {4,1,2,1,2};
        // System.out.println(findNumber(nums));
        System.out.println(uniqueNumber(nums));

    }
}
