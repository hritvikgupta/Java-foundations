package atmmachine;

import javax.swing.*;

public class atm {
    public static void main(String[] args)
    {
        int amount;
        withDraw  withdraw = new withDraw( 10000);
        depositMoney deposit =  new depositMoney();

        while(true)
        {
            String ic;
            JOptionPane.showMessageDialog(null, "Enter the operaiton from the following");
            ic = JOptionPane.showInputDialog("1. Enter 1 to withdraw" + "\n" +
                    "2. Enter 2 for Deposit" + "\n" +
                    "3. Enter 3 for To Check Balance" + "\n"+
                    "4. Enter 4 to exit");

        switch(Integer.parseInt(ic))
        {

                case 1:
                    amount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount"));
                    withdraw.setAmount(amount);
                    withdraw.deductAmount();
                    //another way of doing it by
                    //withDraw  withdraw = new withDraw( 10000, amount);
                    //withdraw.deductamount()
                    JOptionPane.showMessageDialog(null, withdraw);
                    break;
                case 2:
                    amount = Integer.parseInt(JOptionPane.showInputDialog("Enter amount"));
                    deposit.setDeposit(amount);
                    deposit.updateBalance(withdraw);
                    JOptionPane.showMessageDialog(null, deposit);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, withdraw.getBalance());
                    break;

                case 4:
                    System.exit(0);
                    break;

        }

        }

    }
}
