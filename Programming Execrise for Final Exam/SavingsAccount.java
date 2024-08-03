/**
 * Name : Ye Htut Oo
 * CS 111B
 * Programming Exercise for Final Exam
 */

public class SavingsAccount extends BankAccount {
    private static double rate;

    public SavingsAccount(double balance, String owner) {
        super(balance, owner);
    }

    public void compoundInterest() {
        super.balance += super.balance * rate;
    }

    public static void setRate(double r) {
        rate = r;
    }

    @Override
    public String toString(){
        return String.format(super.toString()+ " earning %.1f%% interest",rate * 100);
    }

}

/*

OUTPUT


After accruing interest, here are accounts 1 and 2:
Elvis has $510.0 in account number 1
Madonna has $512.5 in account number 2 earning 2.5% interest
And here's account 3:
Craig has $102.5 in account number 3 earning 2.5% interest
And account 3 after depositing $10:
Craig has $112.5 in account number 3 earning 2.5% interest

*/