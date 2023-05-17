import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Arrays;
import java.util.Comparator;
public class Hospital{
  private String name;
  private Address address;
  private Patient[] patients = new Patient[1500];
  private Comparator[] comparators = new Comparator[100];
public Hospital(String name,Address address){
    this.name=name;
    this.address=address;
    this.initComparators();
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
  public void showPatients(int j){
    Arrays.sort(patients, comparators[j]);
    for(int i=0;i<patients.length;i++){
      if(patients[i]!=null){
        System.out.println(patients[i]);
      }
    }
  }
  public void initComparators(){
    comparators[0] = new Comparator<Patient>(){
      public int compare(Patient o, Patient p){
       if(o==null){
         if(p != null) return -1;
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
     };
    comparators[1] = new Comparator<Patient>(){
      public int compare(Patient o, Patient p){
       if(o==null){
         if(p != null) return -1;
         return 0;
       }
       if(p==null){
         if(o != null) return 1;
       }
        int date = o.getAdmDate().compareTo(p.getAdmDate());
        if(date ==0){
          if(o.getSex()==p.getSex()) return 0;
          if(o.getSex()<p.getSex()) return -1;
          return 1;
        }
        return date;
      }
     };
    comparators[2] = new Comparator<Patient>(){
      public int compare(Patient o, Patient p){
       if(o==null){
         if(p != null) return -1;
         return 0;
        }
        if(p==null){
          if(o != null) return 1;
        }
        return Integer.valueOf(o.getAge()).compareTo(p.getAge());
      }
    };
    comparators[3] = new Comparator<Patient>(){
      public int compare(Patient o, Patient p){
       if(o!=null && p==null) return 1;
       if(o==null && p!=null) return -1;
       return 0;
      }
    };
  }  
  public static void main(String[] args) {
    Address a =new Address("a","a","a","a");
    Hospital h=new Hospital("lol",a);
    h.addPatient(new Patient("k","jw",5,'e'));
    h.addPatient(new Patient("s","jf",4,'d'));
    h.addPatient(new Patient("g","jh",3,'c'));
    h.addPatient(new Patient("a","jj",3,'b'));
    h.addPatient(new Patient("a","jj",3,'a'));
    
    h.showPatients(1);
  }   
}