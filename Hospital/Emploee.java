public class Emploee extends Person{
    protected String special;
    protected double salary;
    public Emploee(String fName, String lName, int age, char sex, String special, char salary) {
        super(fName, lName, age, sex);
        this.special=special;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return super.toString() +", "+special+", "+salary;
    }
    

}