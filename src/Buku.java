    // Class Buku
public class Buku {
    // Attribute
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Buku awalnya belum dipinjam
    }

    // Getter dan Setter (Accessor dan Mutator)
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Polymorphism - method toString() overriding
    @Override
    public String toString() {
        String statusPinjam = dipinjam ? "Sedang Dipinjam" : "Tersedia";
        return "Judul: " + judul + "\nPenulis: " + penulis + "\nTahun Terbit: " + tahunTerbit + "\nStatus: " + statusPinjam;
    }
}

