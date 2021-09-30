package model;

public class Presensi implements Status{
    private String tanggal;
    private int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }
    
    public String toString() {
        return "Tanggal: " + tanggal+ "\n" +
                "Status: " + cekStatus() + "\n";
    }
    
    public String cekStatus(){
        if(status == HADIR)
            return "Hadir";
        else
            return "Alpha";
    }
    
    public String getTanggal() {
        return tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
