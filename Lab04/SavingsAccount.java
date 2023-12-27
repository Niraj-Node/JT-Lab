class CustomException extends Exception {
    private int a;

    CustomException(int Balance) {
        a = Balance;
    }

    @Override
    public String toString() {
        return ("Withdraw Amount Must be Less than Account Balance\n" + "Your Account Balance is : " + a);
    }
}

interface Account {
    void Deposit(int Amt);
    void Withdraw(int Amt) throws CustomException;
}

class SavingsAccount implements Account {
    private int Balance;

    SavingsAccount() {
        Balance = 0;
    }
    SavingsAccount(int Amt) {
        Balance = Amt;
    }

    @Override
    public void Deposit(int Amt) {
        Balance += Amt;
    }
    @Override
    public void Withdraw(int Amt) throws CustomException {
        if(Amt > Balance)
            throw new CustomException(Balance);
        Balance -= Amt;
    }
}

class Tester {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount(5000);
        try {
            obj.Deposit(200);
            obj.Withdraw(700);
            obj.Withdraw(5000);
        }
        catch(CustomException e) {
            System.out.println(e);
        }
    }
}


