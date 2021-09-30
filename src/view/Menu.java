package view;

import controller.Controller;
import javax.swing.JOptionPane;

public class Menu {
    
    public void menuScreen(){
        int input;
        boolean exit = false;
        Controller controller = new Controller();
        controller.dataDummy();
        
        do{
            input = Integer.parseInt(JOptionPane.showInputDialog("1. Print user data\n"
                    + "2. Print Nilai Akhir (NA)\n"
                    + "3. Print rata-rata Nilai Akhir (NR)\n"
                    + "4. Print banyak mahasiswa tidak lulus\n"
                    + "5. Print Matkul ambil mahasiswa\n"
                    + "6. Print total jam Dosen\n"
                    + "7. Print gaji staff\n"
                    + "0. exit"));

            switch (input) {
                case 1:
                    controller.printUserData();
                    break;
                case 2:
                    controller.printNilaiAkhir();
                    break;
                case 3:
                    controller.printRataRataNilaiAkhir();
                    break;
                case 4:
                    controller.printMahasiswaTidakLulus();
                    break;
                case 5:
                    controller.printMatkulAmbilMahasiswa();
                    break;
                case 6:
                    controller.printTotalJamDosen();
                    break;
                case 7:
                    controller.printGajiStaff();
                    break;
                case 0:
                    exit = true;
            }
        }while(!exit);
    }
}
