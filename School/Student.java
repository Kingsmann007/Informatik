public class Student extends Person{
	private String favGame;
	public Student(String name,	String lastName, int age, char sex, String favGame){
		super(name, lastName, age, sex);
		this.favGame=favGame;
	}
	public void takeTest(){
	}
	public void raiseHand(){
	}
	public String getFavGame() {
		return favGame;
	}
	public void setFavGame(String favGame) {
		this.favGame = favGame;
	}
	public String toString(){
		return super.toString()+", "+favGame;
	}
}