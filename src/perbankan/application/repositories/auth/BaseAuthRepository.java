/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.application.repositories.auth;

import java.util.List;
import perbankan.models.User;

/**
 *
 * @author MSI
 */
interface BaseAuthRepository {

    public User login(String username, String password) throws Exception;
    public void register(String username, String password, String role) throws Exception;
    public void updateUser(int index, User user) throws Exception;
    public void deleteUser(int index);
    public List<User> getAllUsers();
}
