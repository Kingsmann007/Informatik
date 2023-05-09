public class Person{
	protected String name;
	protected String lastName;
	protected int age;
	protected char sex;
	public Person(String name,	String lastName, int age, char sex){
		this.name =name;
		this.lastName=lastName;
		this.age=age;
		this.sex=sex;
	}
	public void goToSchool(){
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String toString(){
		return name + ", " +	 lastName + ", " + age + ", " + sex;
	}
}