
public class BankValidate {
 public static void main(String[] args) {
	HDFC hd = new HDFC();
	hd.deposit();
	hd.goldinterest();
	
	ICC ic = new ICC();
	ic.deposit();
	ic.loaninterest();
}
}
