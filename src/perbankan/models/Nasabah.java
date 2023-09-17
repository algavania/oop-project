/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.models;


/**
 *
 * @author MSI
 */
public class Nasabah {
    private String noRekening;
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    private User user;

    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }    

    public Nasabah(String noRekening, String namaAwal, String namaAkhir, User user) {
        this.noRekening = noRekening;
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.user = user;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setNamaAwal(String namaAwal) {
        this.namaAwal = namaAwal;
    }

    public void setNamaAkhir(String namaAkhir) {
        this.namaAkhir = namaAkhir;
    }
}
