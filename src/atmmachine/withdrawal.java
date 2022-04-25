package atmmachine;

public class withdrawal
{
    private int balance;
    private boolean check;
    private int amount;


    public withdrawal(int amount, int balance)
    {
        this.amount = amount;
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean checkLimit(int amount)
    {
        if(this.balance>=amount)
        {
            return true;
        }
        else
            return false;

    }
    public boolean finalAmount(int amount)
    {
        check  = checkLimit(amount);
        if(check)
        {
            int a;
            a = balance-amount;
            setBalance(a);
            return check;

        }
        else
            return check;

    }
    @Override
    public String toString()
    {
        boolean c = finalAmount(this.amount);
        if(c)
            return "Your final balance remaining is " + getBalance();
        else
            return "Insufficient balance";

    }



}

