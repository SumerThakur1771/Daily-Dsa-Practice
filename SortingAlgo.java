public class SortingAlgo {

    public static void bubbleSortAlgo(int nums[]){
        for(int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j + 1]){
                    int temp  = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionSortAlgo(int nums[]){
        for(int i = 0; i < nums.length - 1; i++){
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++){
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            int temp  = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }

    }

    //Dry run this algo for better explanation
    public static void insertionSortAlgo(int nums[]){
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int prev = i - 1;
            //finding correct position to insert
            while(prev >= 0 && nums[prev] > curr){
                nums[prev + 1] = nums[prev]; // shift right to open a hole
                prev--;
            }
            //insertion
            nums[prev + 1] = curr;
        }
    }

    public static void printArr(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(Strings[] args) {
        int nums[] = {7, 4, 1, 5, 3};
        // Integer nums[] = {5, 4, 4, 1, 1};
        // bubbleSortAlgo(nums);
        insertionSortAlgo(nums);
        // Arrays.sort(nums);
        // Arrays.sort(nums, 0 , 3);
        // Arrays.sort(nums, Collections.reverseOrder());
        printArr(nums);
    }
}
