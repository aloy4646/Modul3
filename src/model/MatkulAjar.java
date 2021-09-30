package model;

import java.util.ArrayList;

public class MatkulAjar {
    private MataKuliah matkulAjar = new MataKuliah();
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public MatkulAjar(String kode, int sks, String nama) {
        this.matkulAjar.setKode(kode);
        this.matkulAjar.setSks(sks);
        this.matkulAjar.setNama(nama);
    }
    
    public String toString() {
        String print = "Matkul yang diajar: \n";
        print += matkulAjar.toString();
        for (int i = 0; i < listPresensiStaff.size(); i++) {
            print += listPresensiStaff.get(i).toString();
        }
        return print;
    }

    public void setMatkulAjar(String kode, int sks, String nama) {
        matkulAjar = new MataKuliah(kode, sks, nama);
    }

    public void setListPresensi(ArrayList<PresensiStaff> listPresensi) {
        this.listPresensiStaff = listPresensi;
    }
    
    public void addListPresensi(int jam, String tanggal, int status){
        listPresensiStaff.add(new PresensiStaff(jam, tanggal, status));
    }

    public MataKuliah getMatkulAjar() {
        return matkulAjar;
    }

    public ArrayList<PresensiStaff> getListPresensi() {
        return listPresensiStaff;
    }
    
    
}
