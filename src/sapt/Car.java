package sapt;

public class Car {
    private String marka;
    private int ves;
    private int power;

    public Car (String marka, int ves, int power){
        this.marka = marka;
        this.ves = ves;
        this.power = power;

    }
    public String getMarka() {
        return marka;
    }
    public int getVes() {
        return ves;
    }
    public int getPower() {
        return power;
    }
    public void setMarka(String marka) {
        marka = marka;
    }
    public void setPower(int power) {
        power = power;
    }
    public void setVes(int ves) {
        ves = ves;
    }

    @Override
    public String toString() {
        return "";
    }
}