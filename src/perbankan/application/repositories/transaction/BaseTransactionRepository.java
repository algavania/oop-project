/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.application.repositories.transaction;

import perbankan.models.Nasabah;

/**
 *
 * @author MSI
 */
interface BaseTransactionRepository {
    public void withdraw(Nasabah nasabah, int amount) throws Exception;
    public void deposit(Nasabah nasabah, int amount);
    public void transfer(Nasabah sender, Nasabah receiver, int amount) throws Exception;
}
