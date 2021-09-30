package model;

public class PresensiStaff extends Presensi{
    private int jam;

    public PresensiStaff(int jam, String tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Jam: " + jam + "\n";
    }
    
    public int getJam() {
        return jam;
    }

    
    
}
