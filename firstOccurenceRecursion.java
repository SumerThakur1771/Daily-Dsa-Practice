public class firstOccurenceRecursion {

    public static int firstOccurence(int arr[], int i, int key){
        if(arr[i] == key){
            return i;
        }

        if(i == arr.length){
            return -1; // reached beyond last index, key not found
        }

        return firstOccurence(arr, i + 1, key);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 0, 5)); //space and time complexity both are O(n)

    }
}
