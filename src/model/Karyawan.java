package model;

import java.util.ArrayList;

public class Karyawan extends Staff{
    private int salary;
    private ArrayList <PresensiStaff> listPresensiStaff  = new ArrayList<>();

    public Karyawan(int salary, String nik, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatTanggalLahir, telepon);
        this.salary = salary;
    }
    
    
    @Override
    public String toString() {
        String print = super.toString() + "\nSalary\t\t\t: " + salary + "\nPresensi staff: \n\t";
        for (int i = 0; i < listPresensiStaff.size(); i++) {
            PresensiStaff presensiStaff = listPresensiStaff.get(i);
            print += presensiStaff.getTanggal() + " - " + 
                    presensiStaff.getStatus() + " - " + 
                    presensiStaff.getJam() + "\n\t";
        }
        
        return print;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList <PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList <PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
    
    public void addListPresensiStaff(int jam, String tanggal, int status){
        listPresensiStaff.add(new PresensiStaff(jam, tanggal, status));
    }
}
