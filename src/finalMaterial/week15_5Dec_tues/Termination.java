package finalMaterial.week15_5Dec_tues;

public class Termination {
    //@ requires y >= 0;
    //@ ensures \result == x*y;
    public static int mult(int x, int y) {
        int sum = 0;
        int count = 0;

        //measure of work?
        //initially: have y more iterations to make
        //after adding on 1 x, I have y-1
        //measure is: y-count

        //@ loop_invariant sum == x*count;
        while (count < y) {
            int measure1 = y-count;

            sum = sum + x;
            count = count + 1;

            int measure2 = y-count;

            assert measure1 > measure2;

            //want: when the measure is 0, the loop should stop
            //y-count == 0 -> count >= y

            //y == count -> count >= y
            //yes, this holds, so loop will stop when y reaches count

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

            I want to prove that multRec(x, y) will terminate for all
            nonnegative y.

            Base case. I must prove that multRec(x, y) terminates
            for the smallest possible y -- y == 0. When y is 0, the
            if statement is true and we will return -- thus it
            terminates.

            Inductive step. We assume the inductive hypothesis --
            that multRec(x, k) terminates for some fixed k >= 0.
            We must show that multRec(x, k+1) also terminates. SInce
            k >= 0 we know k+1 >= 1, which means we go into the else.

            In the else, we do multRect(x, k+1-1), which is
            multRect(x, k), which terminates by our inductive hypothesis.
            Thus multRec(x, k+1) also terminates.

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

        //cur = 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 - > 4 -> 2 -> 1

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
