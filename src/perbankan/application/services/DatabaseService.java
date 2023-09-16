/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.application.services;

import java.util.ArrayList;
import java.util.List;
import perbankan.models.Bank;
import perbankan.models.User;

/**
 *
 * @author MSI
 */
public class DatabaseService {

    private static Bank bank;
    private static List<User> users;
    private static User currentUser;

    public static Bank getBank() {
        if (bank == null) {
            bank = new Bank();
        }
        return bank;
    }
    
    public static void setCurrentUser(User user) {
        currentUser = user;
    }
    
    public static User getCurrentUser() {
        return currentUser;
    }

    public static List<User> getUsers() {
        if (users == null) {
            users = new ArrayList();
            users.add(new User("admin", "password", "Pegawai"));
        }
        return users;
    }
}
