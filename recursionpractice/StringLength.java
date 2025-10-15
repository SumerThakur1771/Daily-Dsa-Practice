// package recursionpractice;
// public class StringLength {

//     public static int findLength(String name){
//         if(name.length() == 0){
//             return 0;
//         }
        
//         return 1 + findLength(name.substring(1));
//     }
//     public static void main(String[] args) {
//         String name = "sumer";
//         System.out.println(findLength(name));
//     }
// 

//alternate way
package recursionpractice;
public class StringLength {

    public static int findLength(String name, int i){
        if(i == name.length()){
            return 0;
        }
        
        return 1 + findLength(name, i+1);
    }
    public static void main(String[] args) {
        String name = "sumer";
        System.out.println(findLength(name, 0));
    }
}