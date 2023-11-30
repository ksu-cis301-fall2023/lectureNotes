package finalMaterial.week14_30Nov_thurs;

public class Account {
    private int _balance;
    private boolean _elite;

    //write global invariants
    //@public invariant getBalance() >= 0;
    //@public invariant isElite() == (getBalance() >= 1000000);

    private void globalAsserts() {
        //should assert each global invariant
        assert getBalance() >= 0 : "global invariant violated: balance should be positive";
        assert isElite() == (getBalance() >= 1000000): "global invariant violated: elite status incorrect";
    }

    public Account() {
        _balance = 0;
        _elite = false;
    }

    //write withdrawal and deposit methods + specifications

    //@requires amount >= 0;
    //@requires amount <= getBalance();
    //@ensures getBalance() == \old(getBalance()) - amount;
    public void withdrawal(int amount) {
        //assert my globals
        globalAsserts();

        int oldBalance = getBalance();

        //enforce precondition
        if (amount < 0 || amount > getBalance()) {
            throw new IllegalArgumentException("precondition violated");
        }

        if (amount >= 0 && amount < _balance) {
            _balance -= amount;
        }

        if (_balance < 1000000) {
            _elite = false;
        }

        //assert globals still hold
        globalAsserts();

        //assert postcondition
        assert getBalance() == oldBalance - amount : "postcondition violated";
    }

    //finish globalAsserts method

    //what can we use for the private fields?

    //@pure
    public int getBalance() {
        return _balance;
    }

    //@pure
    public boolean isElite() {
        return _elite;
    }
}