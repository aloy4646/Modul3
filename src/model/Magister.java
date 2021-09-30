package model;

import java.util.ArrayList;


public class Magister extends Mahasiswa{
    private ArrayList<MatkulAmbil> listMataKuliahAmbil = new ArrayList<>();
    private String judulPenelitianTesis;
    
    public Magister(String judulPenelitianTesis, String nim, String jurusan, String nama, String alamat, String tempatTanggalLahir, String telepon) {
        super(nim, jurusan, nama, alamat, tempatTanggalLahir, telepon);
        this.judulPenelitianTesis = judulPenelitianTesis;
    }
    
    
    
    @Override
    public String toString() {
        String print = super.toString() + "\nMata kuliah: ";
        if(listMataKuliahAmbil.isEmpty())
            print += "Kosong\n";
        else{
            for (int i = 0; i < listMataKuliahAmbil.size(); i++) {
                MatkulAmbil matkul = listMataKuliahAmbil.get(i);
                print += matkul.getMatkulAmbil().getKode() + " - " + 
                        matkul.getMatkulAmbil().getNama() + " - " + 
                        matkul.getMatkulAmbil().getSks() + " sks\n\t";
            }
        }
        print += "\nJudul Penelitian Tesis\t\t\t: " + judulPenelitianTesis;
        
        return print;
    }

    public ArrayList<MatkulAmbil> getListMataKuliah() {
        return listMataKuliahAmbil;
    }

    public void setListMataKuliah(ArrayList<MatkulAmbil> listMataKuliahAmbil) {
        this.listMataKuliahAmbil = listMataKuliahAmbil;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }
    
    public void addListMataKuliah(String kode, int sks, String nama, int n1, int n2, int n3){
        listMataKuliahAmbil.add(new MatkulAmbil(kode, sks, nama, n1, n2, n3));
    }
    
    public void addPresensiMatkul(int index, String tanggal, int status){
        listMataKuliahAmbil.get(index).addListPresensi(tanggal, status);
    }
}
