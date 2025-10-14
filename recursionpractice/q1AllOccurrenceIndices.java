package recursionpractice;
public class q1AllOccurrenceIndices {

    public static void printAllIndices(int []arr, int i, int key){
        if(i == arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
            printAllIndices(arr, i + 1, key);
        }else{
            printAllIndices(arr, i + 1, key);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        printAllIndices(arr, 0, 2);
    }
}
