package model;

public class MataKuliah {
    private String kode;
    private int sks;
    private String nama;
    
    public MataKuliah(){}
    
    public MataKuliah(String kode, int sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }
    
    @Override
    public String toString() {
        return "Kode: " + kode+ "\n" +
                "Nama: " + nama + "\n" +
                "Sks: " + sks + "\n";
    }
    
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
