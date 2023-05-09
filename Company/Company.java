class Company {
  private String name;
  private Address address;
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
  private Lamp lamps[] = new Lamp[1000];

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public Company(String name, Address address) {
    this.name = name;
    this.address = address;
  }
  
  public void addLamp(Lamp p) {
    for (int i = 0; i < lamps.length; i++) {
      if (lamps[i] == null) {
        lamps[i] = p;
        return;
      }
    }
  }

  public void remFHydLamp() {
    for (int i = 0; i < lamps.length; i++) {
      if (lamps[i] != null && lamps[i] instanceof HydLamp) {
        lamps[i] = null;
        return;
      }
    }
  }

  public HydLamp getFHydLamp() {
    for (int i = 0; i < lamps.length; i++) {
      if (lamps[i] != null && lamps[i] instanceof HydLamp) {
        return (HydLamp) lamps[i];
      }
    }
    return null;
  }

  public void remLampsUnder100L() {
    for (int i = 0; i < lamps.length; i++) {
      if (lamps[i] != null && lamps[i].getLumen() < 100) {
        lamps[i] = null;
      }
    }
  }

  public Lamp[] getAllLampsEnEFAndLumenHigherThan(char enEf, int lumen) {
    Lamp temp[] = new Lamp[1000];
    for (int i = 0; i < lamps.length; i++) {
      if (lamps[i] != null && lamps[i].getLumen() > lumen && lamps[i].getEnEf() == enEf) {
        temp[i] = lamps[i];
      }
    }
    Lamp fin[] = new Lamp[temp.length];
    int c = 0;
    for (int i = 0; i < temp.length; i++) {
      if (temp[i] != null) {
        fin[c] = temp[i];
        c++;
      }
    }
    return fin;
  }

  public void america() {
    for (int i = 0; i < lamps.length; i++) {
      if (lamps[i] != null && lamps[i] instanceof HydLamp && ((HydLamp) lamps[i]).isMadeInCh()) {
        lamps[i].setLumen(lamps[i].getLumen() - 10);
        if (lamps[i].getLumen() < 0) {
          lamps[i].setLumen(0);
        }
      }
    }
  }

  
  public void sort(int c){
    Lamp temp;
    for(int j = 0;j<lamps.length; j++){
      boolean h = false;
      for(int i = 0;i<lamps.length-j;i++){
        if(lamps[i] !=null && lamps[i+1] !=null){    
          if (lamps[i].getLumen() < lamps[i+1].getLumen() ||
              lamps[i].getLumen() <= lamps[i+1].getLumen() && 
              lamps[i+1] instanceof HydLamp) {
            temp = lamps[i];
            lamps[i] = lamps[i+1];
            lamps[i+1] = temp;
            h= true;
          }
        }
      }
      if(!h){
        for(int i = 0;i<c;i++){
          if(lamps[i]!=null){
            System.out.println(lamps[i]);
          }
        }
        return;
      }
    }
    
  }
  public void getLamps(){
    for(int i =0;i<lamps.length;i++){
      if(lamps[i]!=null){
        System.out.println(lamps[i]);
      }    
    }
  }
  public int compare(int a, int b){
    return lamps[a].compareTo(lamps[b]);
  }
  public static void main(String[] args) {
    Address a = new Address("a","b","c","d");
    Company c = new Company("Lampen inc.", a);
    c.addLamp(new Lamp("tkjhg",1,'e'));
    c.addLamp(new Lamp("e",10,'e'));
    c.addLamp(new HydLamp("fjht",10,'e',1,true));
    c.addLamp(new HydLamp("fjht",10,'e',1,true));
    //c.getBrightestLamps();
    //c.sort(4);
    //c.getLamps();
    System.out.print(c.compare(2,3));
    
  }
}
