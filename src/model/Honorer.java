package model;

public class Honorer extends Dosen{
    private int honorPerSKS;

    public Honorer(int honorPerSKS, String departemen, String nik, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(departemen, nik, nama, alamat, tempatTanggalLahir, telepon);
        this.honorPerSKS = honorPerSKS;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + "\nHonor per SKS\t\t\t: " + honorPerSKS+ "\n";
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }
}
