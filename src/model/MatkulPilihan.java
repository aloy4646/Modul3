package model;

public class MatkulPilihan extends MataKuliah{
    private int jumlahMinimumMahasiswa;

    public MatkulPilihan(int jumlahMinimumMahasiswa, String kode, int sks, String nama) {
        super(kode, sks, nama);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Jumlah minimum Mahasiswa: " + jumlahMinimumMahasiswa + "\n";
    }
    
    public int getJumlahMinimumMahasiswa() {
        return jumlahMinimumMahasiswa;
    }

    public void setJumlahMinimumMahasiswa(int jumlahMinimumMahasiswa) {
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }
}
