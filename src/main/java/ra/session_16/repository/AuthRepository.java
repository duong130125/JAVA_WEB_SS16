package ra.session_16.repository;

import ra.session_16.model.User;

import java.util.List;

public interface AuthRepository {
    List<User> getAllUsers();
    boolean addUser(User user);
}
