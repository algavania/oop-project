/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_4;

/**
 *
 * @author MSI
 */
public class Mahasiswa {

    private final String nama;
    private final int nrp;
    private final int nilaiRPL;
    private final int nilaiBD;
    private final int nilaiPBO;

    public Mahasiswa(String nama, int nrp, int nilaiRPL, int nilaiBD, int nilaiPBO) {
        this.nama = nama;
        this.nrp = nrp;
        this.nilaiRPL = nilaiRPL;
        this.nilaiBD = nilaiBD;
        this.nilaiPBO = nilaiPBO;
    }

    public String getNama() {
        return nama;
    }

    public int getNrp() {
        return nrp;
    }

    public int getNilaiRPL() {
        return nilaiRPL;
    }

    public int getNilaiBD() {
        return nilaiBD;
    }

    public int getNilaiPBO() {
        return nilaiPBO;
    }

    public double calculateAverage() {
        int sum = nilaiRPL + nilaiBD + nilaiPBO;
        return sum/3.0;
    }
}
