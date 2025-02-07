package fintech.model;

/**
 * @author 12S23040 Diana Manurung
 * @author 12S23047 Jennifer Sihotang
 */
public class Account {
    private String accountname;
    private String owner;
    private Double balance;

    public Account (String _accountname,String _owner){
        this.accountname = _accountname;
        this.owner = _owner;
        this.balance = 0.0;
    }

    public String getaccountname(){
        return accountname;
    }

    public String getowner(){
        return owner;
    }

    public Double getbalance(){
        return balance;
    }

    @Override
    public String toString(){
        return accountname + "|" + owner + "|" + 0.0;
    }

}