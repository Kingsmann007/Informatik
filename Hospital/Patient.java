import java.util.Date;
import java.util.Comparator;
public class Patient extends Person implements Comparator<Patient>{
  protected Date admDate;
  public Patient(String fName, String lName, int age, char sex, Date d){
    super(fName, lName, age, sex);
    this.admDate=d;
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
  @Override
  public String toString(){
    return super.toString()+", " +admDate ;
  }
}