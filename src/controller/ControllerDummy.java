package controller;

import java.util.ArrayList;
import model.*;

public class ControllerDummy implements Status{
    public ArrayList<User> listUser = new ArrayList<>();
    
    public void dataDummy(){
        listUser.add(new Sarjana("1120081", "IF", "Aep", "Bandung", "Jakarta, 12-12-2012", "08652***"));
        listUser.add(new Sarjana("1120082", "IF", "Bjorn", "Bandung", "Kategat, 12-12-2012", "08652***"));
        listUser.add(new Sarjana("1120083", "IF", "Cepi", "Bandung", "Bandung, 12-12-2012", "08652***"));
        listUser.add(new Sarjana("1120084", "IF", "Desi", "Bandung", "Fakfak, 12-12-2012", "08652***"));
        listUser.add(new Sarjana("1120085", "IF", "Endang", "Bandung", "Manado, 12-12-2012", "08652***"));
        listUser.add(new Sarjana("1120086", "IF", "Fanny", "Bandung", "Cimahi, 12-12-2012", "08652***"));
        listUser.add(new Magister("Pengaruh Habib Rizieq pada bursa transfer Eropa", "8000732", "AK", "Asep Magister", "London", "Cianjur, 22-2-02", "08361***"));
        listUser.add(new Doktor("Pengaruh wowotek terhadap wowotek", 88, 90, 93, "6620081", "AU", "Asep Doktor", "Kategat", "Citapen. 12-12-1999", "08551***"));
        listUser.add(new DosenTetap(4000000, "Informatika", "9094713", "Asep Dosen", "TT", "Aceh, 9-1-1977", "081793***"));
        listUser.add(new Honorer(100000, "Akuntansi", "9034723", "Asep honorer", "Garut", "Bidan, 28-4-2000", "08936***"));
        listUser.add(new Karyawan(3000000, "907319", "Asep karyawan", "West", "East, 8-9-1988", "08361***"));
        
        //sarjana1
        Sarjana sarjana = (Sarjana) listUser.get(0);
        sarjana.addListMataKuliah("IF-1P3", 2, "Desain Web", 72, 84, 87);
        sarjana.addPresensiMatkul(0, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "28-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "1-10-2020", HADIR);
        
        sarjana.addListMataKuliah("IF-104", 3, "Algoritma", 88, 86, 87);
        sarjana.addPresensiMatkul(1, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "28-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "1-10-2020", HADIR);
        
        sarjana.addListMataKuliah("IF-201", 4, "Struktur data", 87, 78, 87);
        sarjana.addPresensiMatkul(2, "2-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "3-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "4-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "5-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "6-10-2020", HADIR);
        
        //----------------------------------------------------------------------
        //sarjana2
        sarjana = (Sarjana) listUser.get(1);
        sarjana.addListMataKuliah("IF-1P3", 2, "Desain Web", 67, 81, 77);
        sarjana.addPresensiMatkul(0, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(0, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "1-10-2020", HADIR);
        
        sarjana.addListMataKuliah("IF-104", 3, "Algoritma", 75, 82, 77);
        sarjana.addPresensiMatkul(1, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "28-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "1-10-2020", ALPHA);
        
        sarjana.addListMataKuliah("IF-201", 4, "Struktur data", 87, 78, 87);
        sarjana.addPresensiMatkul(2, "2-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "3-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "4-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "5-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "6-10-2020", HADIR);
        
        
        //----------------------------------------------------------------------
        //sarjana3
        sarjana = (Sarjana) listUser.get(2);
        sarjana.addListMataKuliah("IF-1P3", 2, "Desain Web", 67, 81, 77);
        sarjana.addPresensiMatkul(0, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "28-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "1-10-2020", HADIR);
        
        sarjana.addListMataKuliah("KU-104", 3, "Kalkulus 1", 75, 82, 77);
        sarjana.addPresensiMatkul(1, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(1, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "1-10-2020", ALPHA);
        
        sarjana.addListMataKuliah("KU-202", 4, "English 2", 87, 78, 87);
        sarjana.addPresensiMatkul(2, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "28-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "1-10-2020", ALPHA);
        
        //----------------------------------------------------------------------
        //sarjana4
        sarjana = (Sarjana) listUser.get(3);
        sarjana.addListMataKuliah("IF-1P3", 2, "Desain Web", 67, 67, 75);
        sarjana.addPresensiMatkul(0, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(0, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "30-9-2020", ALPHA);
        sarjana.addPresensiMatkul(0, "1-10-2020", ALPHA);
        
        sarjana.addListMataKuliah("KU-104", 3, "Kalkulus 1", 75, 82, 77);
        sarjana.addPresensiMatkul(1, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(1, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "1-10-2020", ALPHA);
        
        sarjana.addListMataKuliah("KU-202", 4, "English 2", 67, 78, 81);
        sarjana.addPresensiMatkul(2, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(2, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "1-10-2020", ALPHA);
        
        //----------------------------------------------------------------------
        //sarjana5
        sarjana = (Sarjana) listUser.get(4);
        sarjana.addListMataKuliah("IF-1P3", 2, "Desain Web", 58, 45, 44);
        sarjana.addPresensiMatkul(0, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(0, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "30-9-2020", ALPHA);
        sarjana.addPresensiMatkul(0, "1-10-2020", HADIR);
        
        sarjana.addListMataKuliah("KU-104", 3, "Kalkulus 1", 75, 80, 73);
        sarjana.addPresensiMatkul(1, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(1, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "1-10-2020", ALPHA);
        
        sarjana.addListMataKuliah("KU-202", 4, "English 2", 55, 68, 51);
        sarjana.addPresensiMatkul(2, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(2, "29-9-2020", ALPHA);
        sarjana.addPresensiMatkul(2, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(2, "1-10-2020", ALPHA);
        
        //----------------------------------------------------------------------
        //sarjana6
        sarjana = (Sarjana) listUser.get(5);
        sarjana.addListMataKuliah("IF-1P3", 2, "Desain Web", 55, 54, 45);
        sarjana.addPresensiMatkul(0, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "28-9-2020", ALPHA);
        sarjana.addPresensiMatkul(0, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(0, "1-10-2020", HADIR);
        
        sarjana.addListMataKuliah("IF-104", 3, "Algoritma", 45, 76, 80);
        sarjana.addPresensiMatkul(1, "27-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "28-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "29-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "30-9-2020", HADIR);
        sarjana.addPresensiMatkul(1, "1-10-2020", ALPHA);
        
        sarjana.addListMataKuliah("IF-201", 4, "Struktur data", 77, 68, 78);
        sarjana.addPresensiMatkul(2, "2-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "3-10-2020", ALPHA);
        sarjana.addPresensiMatkul(2, "4-10-2020", HADIR);
        sarjana.addPresensiMatkul(2, "5-10-2020", ALPHA);
        sarjana.addPresensiMatkul(2, "6-10-2020", HADIR);
        
        //----------------------------------------------------------------------
        //Magister
        Magister magister = (Magister) listUser.get(6);
        magister.addListMataKuliah("999", 3, "Matkul Magister 1", 86, 65, 76);
        magister.addPresensiMatkul(0, "2-10-2020", HADIR);
        magister.addPresensiMatkul(0, "2-10-2020", HADIR);
        magister.addPresensiMatkul(0, "2-10-2020", ALPHA);
        magister.addPresensiMatkul(0, "2-10-2020", HADIR);
        magister.addPresensiMatkul(0, "2-10-2020", HADIR);
        
        //----------------------------------------------------------------------
        //Dosen tetap
        Dosen dosen = (Dosen) listUser.get(8);
        dosen.addListMataKuliah("IF-1P3", 2, "Desain Web");
        dosen.addPresensiMatkul(0, 2, "27-9-2020", HADIR);
        dosen.addPresensiMatkul(0, 2, "28-9-2020", HADIR);
        dosen.addPresensiMatkul(0, 2, "29-9-2020", HADIR);
        dosen.addPresensiMatkul(0, 2, "30-9-2020", ALPHA);
        dosen.addPresensiMatkul(0, 2, "1-10-2020", HADIR);
        
        //----------------------------------------------------------------------
        //Honorer
        Honorer honorer = (Honorer) listUser.get(9);
        honorer.addListMataKuliah("IF-104", 3, "Algoritma");
        honorer.addPresensiMatkul(0, 3, "27-9-2020", HADIR);
        honorer.addPresensiMatkul(0, 3, "28-9-2020", HADIR);
        honorer.addPresensiMatkul(0, 3, "29-9-2020", HADIR);
        honorer.addPresensiMatkul(0, 3, "30-9-2020", HADIR);
        honorer.addPresensiMatkul(0, 3, "1-10-2020", HADIR);
        
        //----------------------------------------------------------------------
        //Karyawan
        Karyawan karyawan = (Karyawan) listUser.get(10);
        karyawan.addListPresensiStaff(7, "2-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "3-9-2020", ALPHA);
        karyawan.addListPresensiStaff(7, "4-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "5-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "6-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "7-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "11-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "12-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "13-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "14-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "15-9-2020", ALPHA);
        karyawan.addListPresensiStaff(7, "18-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "19-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "20-9-2020", ALPHA);
        karyawan.addListPresensiStaff(7, "21-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "22-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "25-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "26-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "27-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "28-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "29-9-2020", HADIR);
        karyawan.addListPresensiStaff(7, "30-9-2020", HADIR);
    }
}
