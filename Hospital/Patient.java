import java.util.Date;
import java.util.Comparator;
public class Patient implements Comparator<Patient>{
  protected String fName;
  protected String lName;
  protected int age;
  protected char sex;
  protected Date admDate;
  public Patient(String fName, String lName, int age, char sex){
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

public Date getAdmDate() {
	return admDate;
}

public void setAdmDate(Date admDate) {
	this.admDate = admDate;
}

public int compare(Patient o, Patient p){
    if(o==null){
      if(p != null) return 1;
      return 0;
    }
    if(p==null){
      if(o != null) return 1;
    }
    int a=Integer.valueOf(o.getAge()).compareTo(p.getAge());
    if(a!=0) return a;
    if(o.getLName()==null){
      if(p.getLName()!=null) return -1;
      if(p.getLName()==null) return 0;
    }
    if(o.getLName()==null) return 0;
    return o.getLName().compareTo(p.getLName());
  }
  public String toString(){
    return fName+", " + lName+", "+age +", "+ sex+", "+admDate ;
  }
}