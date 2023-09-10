package praktikum_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MSI
 */
public class Tabungan {

    public int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int nominal) {
        saldo += nominal;
    }

    public boolean ambilUang(int nominal) {
        if (saldo < nominal) {
            return false;
        }
        saldo -= nominal;
        return true;
    }
}
