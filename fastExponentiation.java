public class fastExponentiation {
  
    //time complexity for this O(log n + 1) in simpler terms could be said as O(log n)  because time taken to go through each bit O(log n)
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
    }
}
