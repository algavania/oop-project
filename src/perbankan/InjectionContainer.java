/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

import perbankan.application.repositories.auth.AuthRepository;
import perbankan.application.repositories.nasabah.NasabahRepository;
import perbankan.application.repositories.transaction.TransactionRepository;

/**
 *
 * @author MSI
 */
public class InjectionContainer {
    public static AuthRepository authRepository = new AuthRepository();
    public static NasabahRepository nasabahRepository = new NasabahRepository();
    public static TransactionRepository transactionRepository = new TransactionRepository();
}
