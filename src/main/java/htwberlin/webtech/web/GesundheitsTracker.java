package htwberlin.webtech.web;

public class GesundheitsTracker {

    private int herzfrequenz;
    private String blutdruck;
    private double gewicht;
    private int schrittzähler;
    private String schlafmuster;
    private String blutzuckerspiegel;

    public GesundheitsTracker(int herzfrequenz, String blutdruck, double gewicht, int schrittzähler, String schlafmuster, String blutzuckerspiegel) {
        this.herzfrequenz = herzfrequenz;
        this.blutdruck = blutdruck;
        this.gewicht = gewicht;
        this.schrittzähler = schrittzähler;
        this.schlafmuster = schlafmuster;
        this.blutzuckerspiegel = blutzuckerspiegel;
    }

    public int getHerzfrequenz() {
        return herzfrequenz;
    }

    public String getBlutdruck() {
        return blutdruck;
    }

    public double getGewicht() {
        return gewicht;
    }

    public int getSchrittzähler() {
        return schrittzähler;
    }

    public String getSchlafmuster() {
        return schlafmuster;
    }

    public String getBlutzuckerspiegel() {
        return blutzuckerspiegel;
    }

}
