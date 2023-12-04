package finalMaterial.week15_5Dec_tues;

public class OpenJMLTest {

    //write function contract
    public static int add(int a) {
        return a + 1;
    }

    //write function contract
    public static int addTwo(int x) {
        int temp = add(x);
        return add(temp);
    }

    /*

    //@ requires arr != null;
    //@ ensures \forall int k; 0 <= k && k < arr.length; \old(arr[k]) == val ==> arr[k] == 0;
    public void zeroMatching(int[] arr, int val) {

        //@ loop_invariant 0 <= i <= arr.length; // Bounds check
        //@ loop_invariant \forall int k; 0 <= k && k < i; \old(arr[k]) == val ==> arr[k] == 0;
        //@ loop_invariant \forall int k; 0 <= k && k < i; \old(arr[k]) != val ==> arr[k] == \old(arr[k]);
        //@ decreasing arr.length-i; // i goes up
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                arr[i] = 0;
            }
        }
    }
    */

    //@ requires arr != null;
    //@ ensures \forall int k; 0 <= k && k < arr.length-1; arr[k] <= arr[k+1];
    public static void selectionSort(int [] arr) {
        //@ ghost final int n = arr.length;
        
        //@ loop_invariant 0 <= i <= n; // Bounds check
        /*@ loop_invariant \forall int x; 0 <= x < i; // Sorted up to i
                               \forall int k; x < k < n; arr[x] <= arr[k];
        @*/
        //@ decreasing n-i; // i goes up
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            
            //@ loop_invariant i < j <= n; // Bounds check
            //@ loop_invariant \forall int k; i <= k < j; min <= arr[k]; // min elem up-to j
            //@ loop_invariant i <= minIndex < n; // bounds check
            //@ loop_invariant min == arr[minIndex]; // minIndex corresponds to min
            //@ decreasing n-j; // j goes up
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    minIndex = j;
                    min = arr[j];
                }
            }
            
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}
