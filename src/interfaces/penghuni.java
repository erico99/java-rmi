package interfaces;

public class penghuni implements java.io.Serializable {
    private int id_phn, kd_kamar;
    private String nik, nama, kontak, alamat;

    public int getId_phn() {
        return id_phn;
    }

    public void setId_phn(int id_phn) {
        this.id_phn = id_phn;
    }

    public int getKd_kamar() {
        return kd_kamar;
    }

    public void setKd_kamar(int kd_kamar) {
        this.kd_kamar = kd_kamar;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    
}
