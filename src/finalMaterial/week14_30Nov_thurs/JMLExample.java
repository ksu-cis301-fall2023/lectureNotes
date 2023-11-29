package finalMaterial.week14_30Nov_thurs;

public class JMLExample {
    //@requires x >= 0;
    //@ensures \result == x+1;
    //@ensures \result >= 1;
    public static int plusOne(int x) {
        //what should we do here?
        if (x < 0) {
            throw new IllegalArgumentException("precondition violated");
        }

        int ans = x + 1;

        //what should we do here?
        assert ans == x+1;
        assert ans >= 1;

        return ans;
    }

    //@requires nums != null;
    //@ensures (\forall int k; 0 <= k && k < nums.length; nums[k] == \old(nums[k]) * 2);
    public static void doubleEach(int[] nums) {
        //what should we do here?
        if (nums == null) {
            throw new IllegalArgumentException("precondition violated");
        }

        int[] numsOld = new int[nums.length];
        System.arraycopy(nums, 0, numsOld, 0, nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }

        //what should we do here?
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == numsOld[i]*2;
        }
    }

    //what should our function contract be?
    public static int mult(int x, int y) {
        //what should we do here?

        int product = 0;
        for (int i = 0; i < y; i++) {
            product += x;
        }

        //what should we do here?

        return product;
    }
}