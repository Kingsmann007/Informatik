import java.util.Date;
import java.util.Arrays;
import java.util.Comparator;
public class Hospital{
  private String name;
  private Address address;
  private Patient[] patients = new Patient[1500];
public Hospital(String name,Address address){
    this.name=name;
    this.address=address;
  }
  public Address getAddress() {
	 return address;
  }

  public void setAddress(Address address) {
	 this.address = address;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  
  public void addPatient(Patient  p){
    for(int i=0;i<patients.length;i++){
      if(patients[i]==null){
        p.setAdmDate(new Date());
        patients[i]=p;
        return;
      }
    }
    
  }
  public void showPatients(){
    Arrays.sort(patients, new Comparator<Patient>(){
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
    });
    for(int i=0;i<patients.length;i++){
      if(patients[i]!=null){
        System.out.println(patients[i]);
      }
    }
  }
  public static void main(String[] args) {
    Address a =new Address("a","a","a","a");
    Hospital h=new Hospital("lol",a);
    h.addPatient(new Patient("k","jw",5,'m'));
    h.addPatient(new Patient("s","jf",4,'m'));
    h.addPatient(new Patient("g","jh",3,'m'));
    h.addPatient(new Patient("a","jj",3,'m'));
    h.addPatient(new Patient("a","jj",3,'m'));
    
    h.showPatients();
  }   
}