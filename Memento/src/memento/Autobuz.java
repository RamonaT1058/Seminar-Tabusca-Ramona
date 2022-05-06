package memento;

public class Autobuz {
    private String numeSofer;
    private double consum;
    private int an;
    private String model;
    private int nrLoc;

    public Autobuz(String nume, double consum, int an, String model, int nrLoc) {
        this.numeSofer = nume;
        this.consum = consum;
        this.an = an;
        this.model = model;
        this.nrLoc = nrLoc;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public double getConsum() {
        return consum;
    }

    public void setConsum(double consum) {
        this.consum = consum;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrLoc() {
        return nrLoc;
    }

    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nume='").append(numeSofer).append('\'');
        sb.append(", consum=").append(consum);
        sb.append(", an=").append(an);
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLoc=").append(nrLoc);
        sb.append('}');
        return sb.toString();
    }

    public MementoAutobuz save(){
        MementoAutobuz nou = new MementoAutobuz(this.numeSofer, (float) this.consum);
        return nou;
    }

    public void undo(MementoAutobuz a){
        this.numeSofer = a.getNumeSofer();
    }
}
