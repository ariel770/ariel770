import java.io.Serializable;

public class AccountToSerializable implements Serializable {

    private int accountNumber ;
    private String firstName ;
    private String lastName ;
    private int balance ;
    public AccountToSerializable(){
        this(0,"","",0);
    }

    public AccountToSerializable(int accountNumber, String firstName, String lastName, int balance) {
        this.accountNumber = accountNumber;
        this.firstName=firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "AccountToSerializable{" +
                "accountNumber=" + accountNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
