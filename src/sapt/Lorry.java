package sapt;

public class Lorry extends Car{

    private int powerLif;

    public Lorry(String marka, int ves, int power, int powerLif){
        super(marka, ves, power);
        this.powerLif = powerLif;
    }
    public void setPowerLif(int PowerLif) {
        this.powerLif = powerLif;
    }
    public int getPowerLif() {
        return powerLif = powerLif;
    }
    @Override
    public String toString(){
        return "Marka " + super.getMarka() + "\n" +
                "Ves " + super.getVes() + "KG" + "\n"+
                "Power " + super.getPower() + "LS" + "\n"+
                "Powerlif  " + getPowerLif();
    }
}
