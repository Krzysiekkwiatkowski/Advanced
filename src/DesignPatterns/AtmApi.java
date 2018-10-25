package DesignPatterns;

public class AtmApi {
    private BankAccount bankAccount;
    private BankAccout bankAccout;
    private Transfer transfer;
    private PhoneCard phoneCard;
    private Loan loan;

    public AtmApi(){
        this.bankAccount = new BankAccount();
        this.bankAccout = new BankAccout();
        this.transfer = new Transfer();
        this.phoneCard = new PhoneCard();
        this.loan = new Loan();
    }

    public void deposit(){
        this.bankAccount.deposit();
    }

    public void payOut(){
        this.bankAccout.payOut();
    }

    public void transferMoney(){
        this.transfer.transferMoney();
    }

    public void recharge(){
        this.phoneCard.recharge();
    }

    public void getLoan(){
        this.loan.getLoan();
    }
}
