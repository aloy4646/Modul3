package controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.*;

public class Controller extends ControllerDummy{
    
    public void printUserData(){
        String print;
        String inputNama = JOptionPane.showInputDialog(null, "Input nama");
        int indexUser = cariUserBerdasarkanNama(inputNama);
        if(indexUser == -1)
            print = "User tidak ada";
        else{
            print = cekUserData(listUser.get(indexUser)) + "\n";
            print += listUser.get(indexUser).toString();
        }
        
        JOptionPane.showMessageDialog(null, print);
    }
    
    String cekUserData(User user){
        if(user instanceof Sarjana)
            return "Mahasiswa Sarjana";
        else if(user instanceof Magister)
            return "Mahasiswa Magister";
        else if(user instanceof Doktor)
            return "Mahasiswa Doktor";
        else if(user instanceof DosenTetap)
            return "Dosen Tetap";
        else if(user instanceof Honorer)
            return "Dosen Honorer";
        else
            return "Karyawan";
    }
    
    int cariUserBerdasarkanNama(String nama){
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i).getNama().equals(nama))
                return i;
        }
        return -1;
    }
    
    
    public void printNilaiAkhir(){
        String print;
        String kodeMatkul;
        int nilai1, nilai2, nilai3, indexMatkul;
        String nim = JOptionPane.showInputDialog("Input NIM: ");
        int indexUser = cariMahasiswaBerdasarkanNIM(nim);
        if(indexUser == -1)
            print = "User tidak ada";
        else{
            print = listUser.get(indexUser).getNama() + "\nNilai Akhir = ";
            if(listUser.get(indexUser) instanceof Doktor){
                Doktor doktor = (Doktor) listUser.get(indexUser);
                nilai1 = doktor.getNilaiSidang1();
                nilai2 = doktor.getNilaiSidang2();
                nilai3 = doktor.getNilaiSidang3();
            }else{
                kodeMatkul = JOptionPane.showInputDialog("Input kode: ");
                
                if(listUser.get(indexUser) instanceof Sarjana){
                    Sarjana sarjana = (Sarjana) listUser.get(indexUser);
                    indexMatkul = cariMatkul(kodeMatkul, sarjana.getListMataKuliah());
                    if(indexMatkul == -1){
                        JOptionPane.showMessageDialog(null, "Kode tidak ada / tidak mengikuti mata kuliah tersebut");
                        return;
                    }else{
                        nilai1 = sarjana.getListMataKuliah().get(indexMatkul).getN1();
                        nilai2 = sarjana.getListMataKuliah().get(indexMatkul).getN2();
                        nilai3 = sarjana.getListMataKuliah().get(indexMatkul).getN3();
                    }
                }else{
                    Magister magister = (Magister) listUser.get(indexUser);
                    indexMatkul = cariMatkul(kodeMatkul, magister.getListMataKuliah());
                    if(indexMatkul == -1){
                        JOptionPane.showMessageDialog(null, "Kode tidak ada / tidak mengikuti mata kuliah tersebut");
                        return;
                    }else{
                        nilai1 = magister.getListMataKuliah().get(indexMatkul).getN1();
                        nilai2 = magister.getListMataKuliah().get(indexMatkul).getN2();
                        nilai3 = magister.getListMataKuliah().get(indexMatkul).getN3();
                    }
                }
            }
            print += hitungNilaiAkhir(nilai1, nilai2, nilai3);
            JOptionPane.showMessageDialog(null, print);
        }
    }
    
    int cariMahasiswaBerdasarkanNIM(String nim){
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i) instanceof Mahasiswa){
                Mahasiswa mahasiswa = (Mahasiswa) listUser.get(i);
                if(mahasiswa.getNim().equals(nim))
                    return i;
            }
        }
        return -1;
    }
    
    int cariMatkul(String kode, ArrayList <MatkulAmbil> matkulAmbil){
        for (int i = 0; i < matkulAmbil.size(); i++) {
            if(matkulAmbil.get(i).getMatkulAmbil().getKode().equals(kode))
                return i;
        }
        return -1;
    }
    
    int hitungNilaiAkhir(int nilai1, int nilai2, int nilai3){
        return (nilai1 + nilai2 + nilai3) / 3;
    }
    
    int hitungNilaiAkhirSarjana(User user, String kode){
        Sarjana sarjana = (Sarjana) user;
        int index = cariMatkul(kode, sarjana.getListMataKuliah());
        if(index != -1){
            return hitungNilaiAkhir(sarjana.getListMataKuliah().get(index).getN1(), sarjana.getListMataKuliah().get(index).getN2(), sarjana.getListMataKuliah().get(index).getN3());
        }else{
            return 0;
        }
    }
    
    int hitungNilaiAkhirMagister(User user, String kode){
        Magister magister = (Magister) user;
        int index = cariMatkul(kode, magister.getListMataKuliah());
        if(index != -1){
            return hitungNilaiAkhir(magister.getListMataKuliah().get(index).getN1(), magister.getListMataKuliah().get(index).getN2(), magister.getListMataKuliah().get(index).getN3());
        }else{
            return -1;
        }
    }
    
    public void printRataRataNilaiAkhir(){
        String kode = JOptionPane.showInputDialog("Input kode matkul: ");
        int totalNilai = 0, totalMahasiswa = 0, hasil;
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i) instanceof Sarjana){
                hasil = hitungNilaiAkhirSarjana(listUser.get(i), kode);
                if(hasil != -1){
                    totalMahasiswa++;
                    totalNilai += hasil;
                }
            }else if(listUser.get(i) instanceof Magister){
                hasil = hitungNilaiAkhirMagister(listUser.get(i), kode);
                if(hasil != -1){
                    totalMahasiswa++;
                    totalNilai += hasil;
                }
            }
        }
        
        int rataRata = totalNilai/totalMahasiswa;
        JOptionPane.showMessageDialog(null, "Rata-rata Nilai Akhir = " + rataRata);
    }
    
    public void printMahasiswaTidakLulus(){
        String kode = JOptionPane.showInputDialog("Input kode matkul: ");
        int totalMahasiswa = 0, totalTidakLulus = 0, hasil;
        
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i) instanceof Sarjana){
                hasil = hitungNilaiAkhirSarjana(listUser.get(i), kode);
                if(hasil != -1){
                    totalMahasiswa++;
                    if(hasil < 56)
                        totalTidakLulus++;
                }
            }else if(listUser.get(i) instanceof Magister){
                hasil = hitungNilaiAkhirMagister(listUser.get(i), kode);
                if(hasil != -1){
                    totalMahasiswa++;
                    if(hasil < 56)
                        totalTidakLulus++;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, totalTidakLulus + " dari " + totalMahasiswa + " mahasiswa tidak lulus matakuliah " + kode);
    }
    
    public void printMatkulAmbilMahasiswa(){
        String nim = JOptionPane.showInputDialog("Input NIM: ");
        int index = cariMahasiswaBerdasarkanNIM(nim);
        if(index == -1)
            JOptionPane.showMessageDialog(null, "Mahasiswa tidak ada");
        else{
            if(listUser.get(index) instanceof Sarjana){
                Sarjana sarjana = (Sarjana) listUser.get(index);
                printMatkulDanPresensi(sarjana.getListMataKuliah());
            }else if(listUser.get(index) instanceof Magister){
                Magister magister = (Magister) listUser.get(index);
                printMatkulDanPresensi(magister.getListMataKuliah());
            }else
                JOptionPane.showMessageDialog(null, "Mahasiswa Doktor tidak punya mata kuliah");
        }
        
    }
    
    void printMatkulDanPresensi(ArrayList <MatkulAmbil> matkulAmbil){
        String print = "";
        for (int i = 0; i < matkulAmbil.size(); i++) {
            print += matkulAmbil.get(i).getMatkulAmbil().getKode() + " - " +
                    matkulAmbil.get(i).getMatkulAmbil().getNama() + " - " + 
                    matkulAmbil.get(i).getMatkulAmbil().getSks() + " sks ";
            print += ", Kehadiran " + hitungTotalKehadiran(matkulAmbil.get(i).getListPresensi()) + "/" + matkulAmbil.get(i).getListPresensi().size() + "\n";
        }
        JOptionPane.showMessageDialog(null, print);
    }
    
    int hitungTotalKehadiran(ArrayList <Presensi> presensi){
        int totalKehadiran = 0;
        for (int i = 0; i < presensi.size(); i++) {
            if(presensi.get(i).getStatus() == HADIR)
                totalKehadiran++;
        }
        
        return totalKehadiran;
    }
    
    public void printTotalJamDosen(){
        String nik = JOptionPane.showInputDialog("Input NIK: ");
        int index = cariMahasiswaBerdasarkanNIK(nik);
        if(index == -1)
            JOptionPane.showMessageDialog(null, "Dosen tidak ada");
        else{
            Dosen dosen = (Dosen) listUser.get(index);
            JOptionPane.showMessageDialog(null, "Total Jam mengajar = " + hitungTotalJamMengajarDosen(dosen.getListMataKuliahAjar()) + " jam");
        }
    }
    
    int cariMahasiswaBerdasarkanNIK(String nik){
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i) instanceof Dosen){
                Dosen dosen = (Dosen) listUser.get(i);
                if(dosen.getNik().equals(nik))
                    return i;
            }
        }
        return -1;
    }
    
    int hitungTotalJamMengajarDosen(ArrayList <MatkulAjar> matkulAjar){
        int total = 0;
        for (int i = 0; i < matkulAjar.size(); i++) {
            total += hitungTotalJamPresensiStaff(matkulAjar.get(i).getListPresensi());
        }
        return total;
    }
    
    int hitungTotalJamPresensiStaff(ArrayList <PresensiStaff> presensiStaff){
        int total = 0;
        for (int i = 0; i < presensiStaff.size(); i++) {
            if(presensiStaff.get(i).getStatus() == HADIR)
                total += presensiStaff.get(i).getJam();
        }
        return total;
    }
    
    public void printGajiStaff(){
        String nik = JOptionPane.showInputDialog("Input NIK: ");
        int index = cariStaffBerdasarkanNIK(nik);
        int unit = 0;
        int gaji;
        if(listUser.get(index) instanceof Karyawan){
            Karyawan karyawan = (Karyawan) listUser.get(index);
            unit = hitungUnitStaff(karyawan.getListPresensiStaff());
            gaji = (int) ((float) unit / 22 * karyawan.getSalary());
        }else if(listUser.get(index) instanceof DosenTetap){
            DosenTetap dosenTetap = (DosenTetap) listUser.get(index);
            for (int i = 0; i < dosenTetap.getListMataKuliahAjar().size(); i++) {
                unit += hitungUnitStaff(dosenTetap.getListMataKuliahAjar().get(i).getListPresensi());
            }
            gaji = dosenTetap.getSalary() + (unit * 25000);
        }else{
            Honorer honorer = (Honorer) listUser.get(index);
            for (int i = 0; i < honorer.getListMataKuliahAjar().size(); i++) {
                unit += hitungUnitStaff(honorer.getListMataKuliahAjar().get(i).getListPresensi());
            }
            gaji = unit * honorer.getHonorPerSKS();
        }
        
        JOptionPane.showMessageDialog(null, "Gaji = " + gaji);
        
    }
    
    int cariStaffBerdasarkanNIK(String nik){
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i) instanceof Staff){
                Staff staff = (Staff) listUser.get(i);
                if(staff.getNik().equals(nik))
                    return i;
            }
        }
        return -1;
    }
    
    int hitungUnitStaff(ArrayList <PresensiStaff> presensiStaff){
        int total = 0;
        for (int i = 0; i < presensiStaff.size(); i++) {
            if(presensiStaff.get(i).getStatus() == HADIR)
                total++;
        }
        return total;
    }
}
