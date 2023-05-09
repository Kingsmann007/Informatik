class HydLamp extends Lamp {
  private double expTemp;
  private boolean madeInCh;

  public HydLamp(String proDesc, int lumen, char enEf, double expTemp, boolean madeInCh){
    super(proDesc, lumen, enEf);
    this.expTemp=expTemp;
    this.madeInCh=madeInCh;
  }

  public double getExpTemp() {
    return expTemp;
  }

  public void setExpTemp(double expTemp) {
    this.expTemp = expTemp;
  }

  public boolean isMadeInCh() {
    return madeInCh;
  }

  public void setMadeInCh(boolean madeInCh) {
    this.madeInCh = madeInCh;
  }
  @Override
  public String toString(){
    return super.toString()+", "+expTemp+", "+madeInCh;
  }
  
}