package latihan;

public class Pasien {

    private String nama;
    private int umur;

    public Pasien() {

    }

    public Pasien(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String toString() {
        return nama + " " + umur;
    }

}
