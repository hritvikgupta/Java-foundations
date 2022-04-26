package atmmachine;

public class withDraw
{
    private int balance;
    private int amount;
    private boolean check = true;

    public withDraw(int balance)
    {
        this.balance = balance;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void deductAmount()
    {
        if(this.balance>=this.amount)
        {
            int a;
            a = this.balance-this.amount;
            System.out.println(a);
            setBalance(a);
        }
        else
        {
            check = false;
        }
    }

    @Override
    public String toString()
    {
        if(check)
        {
            return "Amount Remaining" + " "+ getBalance();
        }
        else
        {
            return "Insufficient Balance";
        }
    }

}
