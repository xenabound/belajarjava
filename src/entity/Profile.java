package entity;

/**
 * Created by sukenda on 28/07/18.
 * Project Belajar
 */
public class Profile extends User {

    private String namaLengkap;
    private String alamat;
    private int umur;
    private String jenisKelamin;

    public Profile(String username, String password) {
        super(username, password);
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "namaLengkap='" + namaLengkap + '\'' +
                ", alamat='" + alamat + '\'' +
                ", umur=" + umur +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                '}';
    }
}
