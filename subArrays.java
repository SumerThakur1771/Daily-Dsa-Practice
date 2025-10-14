public class subArrays {

    public static void printSubrrays(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + numbers[k];
                    // System.out.print(numbers[k] + " ");
                }
                System.out.println(" sum: " + sum);
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
            // System.out.println();
        }
        System.out.print(maxSum);
    }
    public static void main(Strings[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubrrays(numbers);
    }
}
