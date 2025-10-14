public class prefixMaxSumSubArray {
    public static void maxSubrraySum(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int sum;
        int prefix[] = new int[numbers.length];
        //cal prefix array
        prefix[0] = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){                
                    sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                    // System.out.print(numbers[k] + " ");
                System.out.println(" sum: " + sum);
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
            // System.out.println();
        }
        System.out.print(maxSum);
    }

    // public static void kadanes(int numbers[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;
        
    //     for(int i = 0; i < numbers.length; i++){
    //         cs = cs + numbers[i];
    //         if(cs < 0){
    //             cs = 0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }
    //     System.out.println(ms);
    // }

    public static void kadanes(int numbers[]) {
    int cs = numbers[0];  // current sum
    int ms = numbers[0];  // max sum

    for(int i = 1; i < numbers.length; i++){
        // either extend the current subarray or start a new one at i
        cs = Math.max(numbers[i], cs + numbers[i]);
        // update max sum
        ms = Math.max(ms, cs);
    }
    System.out.println(ms);
}
    public static void main(Strings[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // maxSubrraySum(numbers);
        kadanes(numbers);
    }
}
