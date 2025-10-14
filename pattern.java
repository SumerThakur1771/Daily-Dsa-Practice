
public class pattern {

    public static void rectanglePattern(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfNumberPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FloydTriangle(int n){
        int k = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k);
                System.out.print(" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print(1);
                    System.out.print(" ");
                }else{
                    System.out.print(0);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
    
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= 2 * (i - 1); j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // rectanglePattern(10, 7);
        // invertedHalfPyramid(6);
        // invertedHalfNumberPyramid(5);
        // FloydTriangle(5);
        // zeroOneTriangle(5);
        butterfly(5);
    }
}
