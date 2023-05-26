import java.sql.Date;

public class CovPatient extends Patient{
    
    private int vitalCap;
    private boolean longCov;
    public CovPatient(String fName, String lName, int age, char sex, Date admDate, int vitalCap, boolean longCov) {
        super(fName, lName, age, sex, admDate);
    }
    
    public int getVitalCap() {
        return vitalCap;
    }
    public void setVitalCap(int vitalCap) {
        this.vitalCap = vitalCap;
    }
    public boolean isLongCov() {
        return longCov;
    }
    public void setLongCov(boolean longCov) {
        this.longCov = longCov;
    }

    @Override
    public String toString() {
        return  super.toString()+", " + vitalCap + ", " + longCov;
    }
    
}