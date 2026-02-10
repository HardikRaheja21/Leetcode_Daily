// Last updated: 2/10/2026, 3:13:40 PM
class Bank {
    private long[] accounts;

    public Bank(long[] balance) {
        this.accounts = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1 < 1 || account2 < 1 || account1 > accounts.length || account2 > accounts.length) return false;
        if(accounts[account1 - 1] < money) return false;
        accounts[account2 - 1] += money;
        accounts[account1 - 1] -= money;
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(account < 1 || account > accounts.length) return false;
        accounts[account - 1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account < 1 || account > accounts.length) return false;
        if(accounts[account - 1] < money) return false;
        accounts[account - 1] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */