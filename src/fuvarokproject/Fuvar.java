package fuvarokproject;

public class Fuvar {

    private int id;
    private String indulast;
    private int idotartam;
    private double tavolsag;
    private double dij;
    private double borra;
    private String fizMod;

    public Fuvar(String sor) {
        String[] s = sor.split(";");
        this.id = Integer.parseInt(s[0]);
        this.indulast = s[1];
        this.idotartam = Integer.parseInt(s[2]);
        this.tavolsag = Double.parseDouble(s[3]);
        this.dij = Double.parseDouble(s[4]);
        this.borra = Double.parseDouble(s[5]);
        this.fizMod = s[6];
    }

}
