package atmmachine;

public class depositMoney
{
    private int deposit;
    private int balance;


    public depositMoney()
    {
        this.balance = 0;

    }
    public depositMoney(withDraw object)
    {
        this.balance = object.getBalance();
    }

    public void setDeposit(int deposit)
    {
        this.deposit = deposit;
    }

    public int updateBalance(withDraw object)
    {
        this.balance = object.getBalance()+this.deposit;
        object.setBalance(this.balance);
        return object.getBalance();
    }
    @Override
    public String toString()
    {
        return "Amount" + " " +  this.balance;
    }


}
