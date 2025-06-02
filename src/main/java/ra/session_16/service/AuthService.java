package ra.session_16.service;

import ra.session_16.model.User;

import java.util.List;

public interface AuthService {
    List<User> getAllUsers();
    boolean addUser(User user);
}
