package model;

public abstract class Staff extends User{
    private String nik;

    public Staff(String nik, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(nama, alamat, tempatTanggalLahir, telepon);
        this.nik = nik;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNIK\t\t\t: " + nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}
