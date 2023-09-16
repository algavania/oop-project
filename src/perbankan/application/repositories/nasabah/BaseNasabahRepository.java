/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.application.repositories.nasabah;

import perbankan.models.Nasabah;
import perbankan.models.User;

/**
 *
 * @author MSI
 */
interface BaseNasabahRepository {
    public void addNasabah(String namaAwal, String namaAkhir, User user);
    public void editNasabah(int index, String namaAwal, String namaAkhir, User user);
    public void deleteNasabah(int index);
    public Nasabah getNasabahByUsername(String username);
}
