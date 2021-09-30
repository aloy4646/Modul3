package model;

public abstract class Mahasiswa extends User{
    private String nim;
    private String jurusan;

    public Mahasiswa(String nim, String jurusan, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(nama, alamat, tempatTanggalLahir, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNIM\t\t\t: " + nim + "\nJurusan\t\t\t: " + jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
}
