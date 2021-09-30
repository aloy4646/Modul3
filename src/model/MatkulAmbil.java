package model;

import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah matkulAmbil = new MataKuliah();
    private ArrayList<Presensi> listPresensi = new ArrayList<>();
    private int n1;
    private int n2;
    private int n3;
    
    public MatkulAmbil(String kode, int sks, String nama, int n1, int n2, int n3) {
        this.matkulAmbil.setKode(kode);
        this.matkulAmbil.setSks(sks);
        this.matkulAmbil.setNama(nama);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    public String toString() {
        String print = "Matkul yang diambil: \n";
        print += matkulAmbil.toString();
        for (int i = 0; i < listPresensi.size(); i++) {
            print += listPresensi.get(i).toString() +"\n";
        }
        print += "Nilai 1: " + n1 + 
                "\nNilai 2: " + n2 +
                "\nNilai 3: " + n3;
        return print;
    }

    public MataKuliah getMatkulAmbil() {
        return matkulAmbil;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }
    
    public void addListPresensi(String tanggal, int status){
        listPresensi.add(new Presensi(tanggal, status));
    }
    
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
    
    
}
