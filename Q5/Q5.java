package Q5;

class BankAccount{
	static int count = 12345678;
	int accNum;
	float balance;
	String ownerName;
	BankAccount(){
		accNum = count++;
		balance = 0.0f;
		ownerName = "No Name";
	}
	
	BankAccount(float bal, String n){
		accNum = count++;
		balance = bal;
		ownerName = n;
	}
	
	void add(float x) {
		balance += x;
	}
	
	void subtract(float x) {
		balance -= x;
	}
	
	void disp() {
		System.out.println("Account Number: " + accNum);
		System.out.println("Owner: " + ownerName);
		System.out.println("Balance: " + balance);
	}
}

class AccountManagar{
	BankAccount[] bk;
	
	AccountManagar(){
		bk = new BankAccount[10];
	}
	
	AccountManagar(int x) {
		bk = new BankAccount[x];
		for(int i=0;i<x;i++) {
			bk[i] = new BankAccount();
		}
	}
	
	void create(float bal, String n) {
		BankAccount b[] = new BankAccount[bk.length+1];
		for(int i=0;i<bk.length;i++) {
			b[i] = bk[i];
		}
		b[bk.length] = new BankAccount(bal, n);
		bk = b;
	}
	
	void delete(int accNo) {
		int ind = 0;
		for(int i=0;i<bk.length;i++) {
			if(bk[i].accNum == accNo) {
				ind = i;
			}
		}
		BankAccount b[] = new BankAccount[bk.length+1];
		for(int i=0;i<ind;i++) {
			b[i] = bk[i];
		}
		for(int i=ind;i<bk.length;i++) {
			b[i] = bk[i+1];
		}
		bk = b;
	}
	
	void withdraw(int accNo, float bal) {
		for(int i=0;i<bk.length;i++) {
			if(bk[i].accNum == accNo) {
				bk[i].balance -= bal;
				break;
			}
		}
	}
}

public class Q5 {

	public static void main(String[] args) {
		AccountManagar am = new AccountManagar(5);
		am.create(1000.0f, "Tej");
		am.create(1200.0f, "TP");
		am.create(900.0f, "AM");
		for(int i=0;i<am.bk.length;i++) {
			am.bk[i].disp();
		}
	}

}
