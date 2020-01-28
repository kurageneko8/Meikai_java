class Account {
    private String name;
    private String no;
    private long balance;

    // constructer
    Account(String n, String num, long z) {
        name = n;
        no = num;
        balance = z;
    }

    // get private Property via method
    String getName() {
        return name;
    }

    String getNo() {
        return no;
    }
    
    long getBalance() {
        return balance;
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }
}

// package MeikaiJava.Chap08.account2;
/**
 * AccountTester
 */
public class AccountTester {
    public static void main(String[] args) {
        Account adachi = new Account("adachi kouichi", "123456", 200);
        System.out.println();
        System.out.println("********Adachi account");
        System.out.println("AccountName: " + adachi.getName());
        System.out.println("AccountNo: " + adachi.getNo());
        System.out.println("AccountBalance: " + adachi.getBalance());

        Account nakata = new Account("nakata sinji", "439834", 4586200);
        System.out.println();
        System.out.println("********Nakata account");
        System.out.println("AccountName: " + nakata.getName());
        System.out.println("AccountNo: " + nakata.getNo());
        System.out.println("AccountBalance: " + nakata.getBalance());
    }
    
}