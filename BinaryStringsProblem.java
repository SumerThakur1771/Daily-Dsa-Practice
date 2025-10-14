//for a N print number of possible binary strings with no consecutive 1;
public class BinaryStringsProblem {

    public static void printBinaryStrings(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        if(lastPlace == 0){
            printBinaryStrings(n - 1, 0, str+"0");
            printBinaryStrings(n - 1, 1, str+"1");
        }else{
            printBinaryStrings(n - 1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        String str = "";
        printBinaryStrings(3, 0, str);
    }
}
