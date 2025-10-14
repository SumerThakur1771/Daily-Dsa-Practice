public class factorialWithRecursion {

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fn = n * fact(n - 1);
       return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(fact(n)); //time complexty and space complextiy is O(n); space complexity is so because of creating of n call stacks in memory
    }
}
