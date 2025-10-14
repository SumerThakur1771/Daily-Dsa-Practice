public class Tiling {

    public static int TilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        //so I have option of either laying tile horizontal way or vertical way and in this ques board size is 2 * n where 2 is breadth and n is length and tile size is 2 * 1 where 2 is lenght and 1 is breadth

        int veriticalLayout = TilingProblem(n - 1); //if tile is layed vertically then whole length will be covered and n - 1 ways or space will be left to cover with tiles.

        int horizontalLayout = TilingProblem(n - 2); //if tile is layed horizontally then only half of width is covered one more tile will layed down it so n - 2 ways or space will be left to cover with tiles.
        
        int totalWays = veriticalLayout + horizontalLayout;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(5));
    }
}
