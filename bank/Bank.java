import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.lang.Math;
public class Bank{
	private String name;
	private int bic;
	private int numOfCustomers;
	private int secLvl;
	private String countryOfOrigin;
	private Address address;
	private BankAccount[] bankAccounts = new BankAccount[2000];
	public Bank(String name, int bic, int numOfCustomers, int secLvl, String countryOfOrigin, Address address){
		this.name = name;
		this.bic = bic;
		this.numOfCustomers = numOfCustomers;
		this.secLvl = secLvl;
		this.bic = bic;
		this.countryOfOrigin = countryOfOrigin;
	}
	public String toString(){
		return this.name +", "+ this.bic +", "+this.numOfCustomers+", "+this.secLvl+", "+this.bic+", "+this.countryOfOrigin+", "+this.address; 	
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getBic(){
		return bic;
	}
	public void setBic(int bic){
		this.bic = bic;
	}
	public int getNumOfCustomers(){
		return numOfCustomers;
	}
	public void setNumOfCustomers(int numOfCustomers){
		this.numOfCustomers = numOfCustomers;
	}
	public int getSecLvl(){
		return secLvl;
	}
	public void setSecLvl(int secLvl){
		this.secLvl = secLvl;
	}
	public String getCountryOfOrigin(){
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	public Address getAddress(){
		return address;
	}
	public void setAddress(Address address){
		this.address = address;
	}
	public void delAllBAcc(){
		for(int i=0;i<bankAccounts.length;i++){
			if(bankAccounts[i]!=null){
				bankAccounts[i]=null;
			}
		}
	}
	public String delBAcc(String name){
		for(int i = 0;i<bankAccounts.length;i++){
			if(bankAccounts[i]!=null && bankAccounts[i].getOwner().equals(name)){
				bankAccounts[i] = null;
				return "Acount was deleted!";
			}
		}
		return "No Such Account";
	}
	public String countryCode(String country){
		int nr1=0;
		int nr2=0;
		nr1= Character.toUpperCase(country.charAt(0))-55;
		nr2= Character.toUpperCase(country.charAt(1))-55;
		String total=String.valueOf(nr1)+String.valueOf(nr2);
		return total;
	}
	public void addBankAccount( String owner){
		String highestBAccNr= "0000000000";
		int secNr = 00;
		String secNrK =  "00";
		for(int i=0;i<bankAccounts.length;i++){
			if(bankAccounts[i]!=null){
				if(Integer.parseInt(highestBAccNr) == bankAccounts[i].getbAccNr()){
					highestBAccNr=String.valueOf(bankAccounts[i].getbAccNr()+1);
					while(highestBAccNr.length()<10){
						highestBAccNr = "0" + highestBAccNr;
					}
				}
			}
		}
		 
		String number = String.valueOf(bic)+highestBAccNr+countryCode(countryOfOrigin)+"00";
		String f1 = "";
		String f2 = "";
		String f3 = "";
		f1 = number.substring(0, 9);
		f2 = number.substring(10, 17);
		f3 = number.substring(17, number.length()-1);
		int rest1 = Integer.parseInt(f1) % 97;
		int rest2 = (rest1 * (int)Math.pow(10,7) + Integer.parseInt(f2)) % 97;
		rest1 = (rest2 * (int)Math.pow(10,7) + Integer.parseInt(f3)) % 97;
		secNr = 98-((rest1 * 10) % 97);
		if(secNr <= 9){
			secNrK = "0"+ String.valueOf(secNr);
		}else{
			secNrK = String.valueOf(secNr);
		}
		String iBAN ="DE"+", "+secNrK+", " +String.valueOf(bic)+ ", "+ highestBAccNr;
		BankAccount b = new BankAccount( iBAN, owner, this, 0.0, Integer.parseInt(highestBAccNr),0);
		for(int i = 0;i<bankAccounts.length;i++){
			if(bankAccounts[i] == null){
				bankAccounts[i] = b;
				return;
			}
		}
	}
	public void printBankAccounts(){
		for(int i=0;i<bankAccounts.length;i++){
			if(bankAccounts[i] != null){
				System.out.println(bankAccounts[i]);
			}
		}
	}
	public void setLineOfCreditTo0(){
		for(int i = 0;i<bankAccounts.length;i++){
			if(bankAccounts[i] != null){
				bankAccounts[i].setLineOfCredit(0);
			}
		}
	}
	public String printBankAccount(String name){
		for(int i=0;i<bankAccounts.length;i++){
			if(bankAccounts[i]!=null && bankAccounts[i].getOwner().equals(name)){
					return bankAccounts[i].toString();
			}
		}
		return "No Such Account";
	}
	public String transferMoney(String name1, String name2, double amount){
		for(int i=0;i<bankAccounts.length;i++){
			if(bankAccounts[i]!=null && bankAccounts[i].getOwner().equals(name1)){
				for(int j=0;j<bankAccounts.length;j++){
					if(bankAccounts[j]!=null && bankAccounts[j].getOwner().equals(name2)){
						bankAccounts[i].setMoney(bankAccounts[i].getMoney()-amount);
						bankAccounts[j].setMoney(bankAccounts[j].getMoney()+amount);
						return "Transfer  succesful";
					}
				}			
			}
		}
		return "Transfer failed";
	}
	public static void main(String[] args){
		Address a = new Address("teststr","10","51643","gummersbach");
		Bank bank = new Bank("Sparkasse", 38450000, 100, 7, "Deutschland", a);
		bank.setAddress(a);
		bank.addBankAccount("Manfred Reimund Schmidtberger");
		bank.addBankAccount("Louis Samuel Krasnek");
		bank.addBankAccount("Alexander Schmidtberger");
		bank.printBankAccounts();
		//GUI ist ausgeklammert(auf REPLIT funktioniert das!!!)
		/*JFrame g =new JFrame("Bank Interface");
		JFrame h =new JFrame("Bank Interface");
		JFrame f =new JFrame("Bank Interface");  
    //textfields
		//output
		JTextField tf=new JTextField("");  
    tf.setBounds(50, 300, 400,20);  
    //input
		//name
		JTextField name=new JTextField("name1");  
    name.setBounds(50, 50, 400,20);
		JTextField name2=new JTextField("name2");  
    name2.setBounds(50, 145, 400,20);
		JTextField amount=new JTextField(); 
		amount.setBounds(50, 205, 400,20);
		JTextField newName=new JTextField(); 
		newName.setBounds(50, 50, 400,20);
		//buttons
		//namejava BAn
		JButton trans=new JButton("Add new Account");
		trans.setBounds(50,50,200,30);  
  	trans.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				f.setVisible(false);
				g.setVisible(false);
				h.setVisible(true);
    	}  
    });
		JButton add=new JButton("Transfer");
		add.setBounds(50,85,200,30);  
  	add.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				f.setVisible(true);
				g.setVisible(false);
				h.setVisible(false);
    	}  
    });
		JButton addAcc=new JButton("Add new Account");
		addAcc.setBounds(100,85,200,30);  
  	addAcc.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				bank.addBankAccount(newName.getText());
    	}  
    });
		JButton back=new JButton("back");
		back.setBounds(50,325,200,30);  
  	back.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				f.setVisible(false);
				g.setVisible(true);
				h.setVisible(false);
    	}  
    });
		JButton back2=new JButton("back");
		back2.setBounds(50,325,200,30);  
  	back2.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				f.setVisible(false);
				g.setVisible(true);
				h.setVisible(false);
    	}  
    });
		JButton b=new JButton("Get Info");  
    b.setBounds(50,170,110,30);  
  	b.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				tf.setText(bank.printBankAccount(name2.getText()));
    	}  
    });
		JButton delAcc=new JButton("Delete Account");  
    delAcc.setBounds(170,170,110,30);  
  	delAcc.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				tf.setText(bank.delBAcc(name2.getText()));
    	}  
    });
		JButton c=new JButton("Get Info");  
    c.setBounds(50,75,110,30);  
  	c.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				tf.setText(bank.printBankAccount(name.getText()));
    	}  
    });
		JButton delAcc2=new JButton("Delete Account");  
    delAcc2.setBounds(170,75,110,30);  
  	delAcc2.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				tf.setText(bank.delBAcc(name.getText()));
    	}  
    });
		JButton transfer=new JButton("Transfer");
		transfer.setBackground(Color.black);
		transfer.setBounds(50,230,110,30);
		transfer.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
				tf.setText(bank.transferMoney(name.getText(), name2.getText(), (double)Integer.parseInt(amount.getText())));
    	}  
    });
		//label
		JLabel l1= new JLabel("Output:");
		l1.setBounds(50, 265, 500, 30);
		JLabel l3=new JLabel("To");
		l3.setBounds(50, 110, 500, 30);
		JLabel l2= new JLabel("Transfer money from");
		l2.setBounds(50, 25, 500, 30);

		f.add(transfer);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(b);
		f.add(delAcc);
		f.add(c);
		f.add(delAcc2);
		f.add(tf);
		f.add(name);
		f.add(name2);
		f.add(amount);
		f.add(back);
    f.setSize(500,500);  
    f.setLayout(null); 
		g.add(add);
		g.add(trans);
		g.setSize(280,300);
		g.setLayout(null); 
    g.setVisible(true);
		h.add(back2);
		h.add(addAcc);
		h.add(newName);
		h.setSize(500,500);
		h.setLayout(null); 
    h.setVisible(false);*/
	}
}