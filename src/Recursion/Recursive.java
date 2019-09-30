package Recursion;

public class Recursive {
    public static void main(String[] args) {
        int[] testArray = {3,4,4 ,5,2,7,3,1,4,7,3,5};
        System.out.println(smallest(testArray));
    }

    public static int smallest(int[] arr){
        //int sm = arr[arr.length -1];
        //System.out.println(sm);
        int size = arr.length;
        //System.out.println(size);
        return smallest(arr, size, sm);
    }

    private static int smallest(int[] arr,  int size, int smallest){
        if(size == 0){
            return smallest;
        }
        else{
            if (arr[size-1] < smallest){
                smallest = arr[size-1];
            }
            return smallest(arr, size-1, smallest);

        }
    }

    public static int cSmallest(int []arr){
        return cSmallest(arr, arr.length-1);
    }

    private static int cSmallest(int []arr, int lastIndex){
        int small = cSmallest(arr, lastIndex-1);
        if (small < arr[lastIndex]) {
            return small;
        }
        else {
            return arr[lastIndex];
        }
    }
}
