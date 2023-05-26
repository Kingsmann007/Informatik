public abstract class Person{
    protected String fName;
    protected String lName;
    protected int age;
    protected char sex;
    public Person(String fName, String lName, int age, char sex){
        this.fName=fName;
        this.lName=lName;
        this.age=age;
        this.sex=sex;     
    }
  
    public String getFName() {
	    return fName;
    }

    public void setFName(String fName) {
	    this.fName = fName;
    }
    public String getLName() {
	    return lName;
    }

    public void setLName(String lName) {
	    this.lName = lName;
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
        return this.fName + ", "+ this.lName + ", " + this.age +", "+this.sex;
    }
}