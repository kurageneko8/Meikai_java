/**
 * TimeAccount
 */
public class TimeAccount {

    private String name;
    private String no;
    private long balance;
    private long timeBalance;

    TimeAccount(String n, String num, long z, long timeBalance) {
        name =  n;
        no = num;
        balance = z;
        this.timeBalance = timeBalance;
    }

    String getName(){
        return name;
    }

    String getNo(){
        return no;
    }

    String getBalance(){
        return balance;
    }

    String getTimeBalance(){
        return TimeBalance;
    }
    String deposit(long k) {
        return balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }
    void cancel() {
        balance += timeBalance;
        timeBalance = 0;
    }

}