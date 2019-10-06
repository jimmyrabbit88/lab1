package Recursion;

public class Recursive {
    public static void main(String[] args) {

    }

    public static int smallest(int[] arr){
        int lIndex = arr.length - 1;
        return smallest(arr, lIndex);
    }

    private static int smallest(int[] arr,  int lastIndex){
        if(lastIndex == 0){
            return arr[lastIndex];
        }
        else {
            int small = smallest(arr, lastIndex -1);
            if(small < arr[lastIndex]){
                return small;
            }
            else{
                return arr[lastIndex];
            }
        }
    }

    public static int binarySearch(int[] arr, int find){
        int lIndex = arr.length - 1;
        return binarySearch(arr, find, lIndex);
    }

    private static int binarySearch(int[] arr, int find, int lastIndex){
        if(lastIndex == 0){
            if(arr[lastIndex] == find){
                return 0;
            }
            else {
                return -1;
            }
        }
        else{
            int index = binarySearch(arr, find, lastIndex -1);
            if (index == -1){
                if(arr[lastIndex] == find){
                    return lastIndex;
                }
                else{
                    return -1;
                }
            }
            else{
                return index;
            }
        }
    }

}
