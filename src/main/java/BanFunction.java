
abstract class BanFunction {

     
    public void deposit() {
    	int a=10;
    	int b=20;
    	System.out.println(a);
    	System.out.println(b);
    }
    
    public void withdraw() {
    	System.out.println("common for all bank");
    }
    abstract void loaninterest();
    abstract void goldinterest();
     
}
