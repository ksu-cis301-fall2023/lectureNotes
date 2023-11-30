package finalMaterial.week14_30Nov_thurs;

public class JMLArrays {

    //@requires orig != null;
    //@ensures \result.length == orig.length;
    //@ensures (\forall int k; k >= 0 && k < orig.length; orig[k].length() == \result[k]);
    public static int[] getStringLengths(String[] orig) {
        //enforce precondition
        if (orig == null) {
            throw new IllegalArgumentException("precondition violated: parameter should not be null");
        }

        int[] arr = new int[orig.length];

        for (int i = 0; i < orig.length; i++) {
            arr[i] = orig[i].length();
        }

        assert arr.length == orig.length : "poscondition was violated: length of return array should match";

        for (int i = 0; i < arr.length; i++) {
            assert arr[i] == orig[i].length() : "postcondition violated: doesn't match string length";
        }

        return arr;
    }

    //@requires nums != null;
    //@requires nums.length > 0;
    //@ensures (\forall int k; k >= 0 && k < nums.length; \result <= nums[k]);
    //@ensures (\exists int k; k >= 0 && k < nums.length; \result == nums[k]);
    public static int min(int[] nums) {
        //we did not implement this in class

        //would still need to enforce precondition

        int small = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < small) {
                small = nums[i];
            }
        }

        return small;

        //would still need to assert postcondition
    }
}
