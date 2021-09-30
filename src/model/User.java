package model;


public abstract class User {
    private String nama;
    private String alamat;
    private String tempatTanggalLahir;
    private String telepon;

    public User(String nama, String alamat, String tempatTanggalLahir, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatTanggalLahir = tempatTanggalLahir;
        this.telepon = telepon;
    }
    
    public String toString(){
        return "Nama\t\t\t: " +nama + "\nAlamat\t\t\t: " + alamat + "\nTempat, Tanggal lahir\t: " + tempatTanggalLahir + "\nTelepon\t\t\t: " + telepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatTanggalLahir() {
        return tempatTanggalLahir;
    }

    public void setTempatTanggalLahir(String tempatTanggalLahir) {
        this.tempatTanggalLahir = tempatTanggalLahir;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    
}
