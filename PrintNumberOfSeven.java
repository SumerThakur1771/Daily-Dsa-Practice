public class PrintNumberOfSeven {

   public static void CountofSeven(int matrix[][]){
      int count = 0;
      for(int i = 0; i < matrix.length; i++){
         for(int j = 0; j < matrix[0].length; j++){
            if(matrix[i][j] == 7){
               count++;
            }
         }
      }
      System.out.println(count);
   }
   public static void main(Strings[] args) {
       int matrix [][] = {{4,7,8},{8,8,7}};
       CountofSeven(matrix);
   }
}
