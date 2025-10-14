public class FriendsPairingProblem {

    public static int friendsPairing(int n){
        if(n == 1 || n== 2){
            return n;
        }

        //single
        int fnm1 = friendsPairing(n - 1);

        //pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = n - 1; //these are the number of ways A can form pair as A is taken out then n-1 elements are left to form the pair

        //total ways
        int totalWays = fnm1 + pairWays * fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
    }
}
