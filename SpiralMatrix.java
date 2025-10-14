public class SpiralMatrix {

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){ // equals to is there in condition for odd number of matrix
            //top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right, remember why are intiating i with startRow + 1 as last cell of first row is already printed
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow){ // avoid double-printing a single remaining row
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if(startCol == endCol){ // avoid double-printing a single remaining column
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(Strings[] args) {
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

        printSpiral(matrix);
    }
}
