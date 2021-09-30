package model;

import java.util.ArrayList;


public class Sarjana extends Mahasiswa{
    private ArrayList<MatkulAmbil> listMataKuliahAmbil = new ArrayList<>();

    public Sarjana(String nim, String jurusan, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(nim, jurusan, nama, alamat, tempatTanggalLahir, telepon);
    }
    
    
    
    @Override
    public String toString() {
        String print = super.toString() + "\nMata kuliah: ";
        if(listMataKuliahAmbil.isEmpty())
            print += "Kosong\n";
        else{
            print += "\n\t";
            for (int i = 0; i < listMataKuliahAmbil.size(); i++) {
                MatkulAmbil matkul = listMataKuliahAmbil.get(i);
                print += matkul.getMatkulAmbil().getKode() + " - " + 
                        matkul.getMatkulAmbil().getNama() + " - " +
                        matkul.getMatkulAmbil().getSks() + " sks\n\t";
            }
        }
        return print;
    }

    public ArrayList<MatkulAmbil> getListMataKuliah() {
        return listMataKuliahAmbil;
    }

    public void setListMataKuliahAmbil(ArrayList<MatkulAmbil> listMataKuliahAmbil) {
        this.listMataKuliahAmbil = listMataKuliahAmbil;
    }
    
    public void addListMataKuliah(String kode, int sks, String nama, int n1, int n2, int n3){
        listMataKuliahAmbil.add(new MatkulAmbil(kode, sks, nama, n1, n2, n3));
    }
    
    public void addPresensiMatkul(int index, String tanggal, int status){
        listMataKuliahAmbil.get(index).addListPresensi(tanggal, status);
    }
    
}
