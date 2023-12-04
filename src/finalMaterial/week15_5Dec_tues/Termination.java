package finalMaterial.week15_5Dec_tues;

public class Termination {
    //@ requires y >= 0;
    //@ ensures \result == x*y;
    public static int mult(int x, int y) {
        int sum = 0;
        int count = 0;

        //measure of work?

        //@ loop_invariant sum == x*count;
        while (count < y) {
            sum = sum + x;
            count = count + 1;

            //measure should decrease with each iteration
            //when I have no work left, then my loop should be done
        }

        return sum;
    }

    //@requires y >= 0;
    //@ensures \result == x*y;
    public static int multRec(int x, int y) {
        //what happens here if we don't enforce our precondition?

        /*
            How to show termination with recursive method?
        */

        if (y == 0) {
            return 0;
        }
        else {
            return x + multRec(x, y-1);
        }
    }



    //@requires n > 0;
    //@ensures \result == 1;
    public static int collatz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("parameter should be positive");
        }

        //cur = 52 -> ?

        int cur = n;
        while (cur > 1) {
            if (cur % 2 == 0) {
                cur = cur / 2;
            }
            else {
                cur = 3 * cur + 1;
            }
        }

        return cur;
    }
}
