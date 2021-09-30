package model;

import java.util.ArrayList;

public abstract class Dosen extends Staff{
    private String departemen;
    private ArrayList <MatkulAjar> listMataKuliahAjar = new ArrayList<>();

    public Dosen(String departemen, String nik, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatTanggalLahir, telepon);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void setListMataKuliahDiajar(ArrayList<MatkulAjar> listMataKuliahAjar) {
        this.listMataKuliahAjar = listMataKuliahAjar;
    }

    public ArrayList<MatkulAjar> getListMataKuliahAjar() {
        return listMataKuliahAjar;
    }

    public void setListMataKuliahAjar(ArrayList<MatkulAjar> listMataKuliahAjar) {
        this.listMataKuliahAjar = listMataKuliahAjar;
    }
    
    @Override
    public String toString() {
        String print = super.toString() + "\nDepartemen\t\t\t: " + departemen + "\nMata Kuliah yang diajar: ";
        if(listMataKuliahAjar.isEmpty())
            print += "Kosong";
        else{
            print += "\n";
            for (int i = 0; i < listMataKuliahAjar.size(); i++) {
                MatkulAjar matkul = listMataKuliahAjar.get(i);
                print += matkul.getMatkulAjar().getKode() + " - " + 
                        matkul.getMatkulAjar().getNama() + " - " + 
                        matkul.getMatkulAjar().getSks() + " sks\n\t";
            }
        }
        
        return print;
    }
    
    public void addListMataKuliah(String kode, int sks, String nama){
        listMataKuliahAjar.add(new MatkulAjar(kode, sks, nama));
    }
    
    public void addPresensiMatkul(int index, int jam, String tanggal, int status){
        listMataKuliahAjar.get(index).addListPresensi(jam, tanggal, status);
    }
}
