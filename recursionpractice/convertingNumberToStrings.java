package recursionpractice;


public class convertingNumberToStrings {

    public static void printConvertedString(String numbers[], int num){
        if(num == 0){
            return;
        }

        int lastDigit = num % 10;
        printConvertedString(numbers, num/10);
        System.out.print(numbers[lastDigit]+" ");
    }
    public static void main(String[] args) {
        String numbers[] = {"zero", "one","two","three","four","five","six","seven","eight","nine"};
        int num = 2019;
        printConvertedString(numbers, num);
    }
}
