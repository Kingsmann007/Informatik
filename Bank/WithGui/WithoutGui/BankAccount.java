
public class BankAccount{
	private String iBAN;
	private String owner;
	private Bank bank;
	private double lineOfCredit;
	private int bAccNr;
	private double money;

	public BankAccount(String iBAN, String owner, Bank bank, double lineOfCredit, int bAccNr, double money){
		this.iBAN = iBAN;
		this.owner = owner;
		this.bank = bank;
		this.lineOfCredit = lineOfCredit;
		this.bAccNr = bAccNr;
		this.money = money;
	}
	public double getMoney(){
		return money;
	}
	public void setMoney(double money){
		this.money = money;
	}
	public String getiBAN(){
		return iBAN;
	}
	public void setiBAN(String iBAN){
		this.iBAN = iBAN;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}
	public Bank getBank(){
		return bank;
	}
	public void setBank(Bank bank){
		this.bank = bank;
	}
	public double getLineOfCredit(){
		return lineOfCredit;
	}
	public void setLineOfCredit(double lineOfCredit){
		this.lineOfCredit = lineOfCredit;
	}
	public int getbAccNr(){
		return bAccNr;
	}
	public void setbAccNr(int bAccNr){
		this.bAccNr = bAccNr;
	}
	public String toString(){
		return iBAN + ", " + owner + ", " + lineOfCredit+", "+money;
	}
}