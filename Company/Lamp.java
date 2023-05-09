class Lamp implements Comparable<Lamp>{
  protected String proDesc;
  protected int lumen;
  protected char enEf;

  public Lamp(String proDesc, int lumen, char enEf) {
    this.proDesc = proDesc;
    this.lumen = lumen;
    this.enEf = enEf;
  }

  public String getProDesc() {
    return proDesc;
  }

  public void setProDesc(String proDesc) {
    this.proDesc = proDesc;
  }

  public int getLumen() {
    return lumen;
  }

  public void setLumen(int lumen) {
    this.lumen = lumen;
  }

  public char getEnEf() {
    return enEf;
  }

  public void setEnEf(char enEf) {
    this.enEf = enEf;
  }
  public String toString(){
    return proDesc +", "+ lumen +", "+ enEf;
  }
  public int compareTo(Lamp a){
    
    if( this.getLumen() ==a.getLumen() ){
      return this.getProDesc().compareTo(a.getProDesc());  
    }else if(this.getLumen() <a.getLumen()){
      return -1;
    }else{
      return 1;
    } 
  }
}