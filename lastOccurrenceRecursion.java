public class lastOccurrenceRecursion {

    public static int lastOccurence(int arr[], int i, int key){

        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurence(arr, i + 1, key);

        if(isFound == -1 && arr[i] == key){  //dry run this code for better explanation
            return i; //only last occurence will have previous return(isfound) of -1 and arr[i] == key then it will further return isfound(index at which the last occurence was) and even going down if the occurence appears but it will have isfound as index at last occurrence not -1
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arr, 0, 5));        
    }
}
