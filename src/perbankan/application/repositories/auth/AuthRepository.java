/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan.application.repositories.auth;

import perbankan.application.repositories.nasabah.NasabahRepository;
import perbankan.application.services.DatabaseService;
import java.util.ArrayList;
import java.util.List;
import perbankan.InjectionContainer;
import perbankan.models.User;

/**
 *
 * @author MSI
 */
public class AuthRepository implements BaseAuthRepository {

    private final List<User> users = DatabaseService.getUsers();

    @Override
    public User login(String username, String password) throws Exception {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    return user;
                } else {
                    throw new Exception("Password salah");
                }
            }
        }
        throw new Exception("User tidak ditemukan");
    }

    @Override
    public void register(String username, String password, String role) throws Exception {
        User newUser = new User(username, password, role);
        checkIfUsernameExists(username);
        users.add(newUser);
    }

    private void checkIfUsernameExists(String username) throws Exception {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getUsername().equals(username)) {
                throw new Exception("Username sudah dipakai");
            }
        }
    }

    @Override
    public void updateUser(int index, User user) throws Exception {
        checkIfUsernameExists(user.getUsername());
        users.set(index, user);
    }

    @Override
    public void deleteUser(int index) {
        users.remove(index);
    }

    @Override
    public List<User> getAllUsers() {
        NasabahRepository repository = InjectionContainer.nasabahRepository;
        List<User> allUsers = new ArrayList();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getRole().equals("User") && repository.getNasabahByUsername(user.getUsername()) == null) {
                allUsers.add(user);
            }
        }
        return allUsers;
    }

}
