package model;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap(int salary, String departemen, String nik, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(departemen, nik, nama, alamat, tempatTanggalLahir, telepon);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSalary\t\t\t: " + salary + "\n";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
