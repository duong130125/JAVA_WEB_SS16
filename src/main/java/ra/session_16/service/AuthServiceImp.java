package ra.session_16.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.session_16.model.User;
import ra.session_16.repository.AuthRepository;
import ra.session_16.repository.AuthRepositoryImp;

import java.util.List;

@Service
public class AuthServiceImp implements AuthService {
    @Autowired
    public AuthRepository authRepository;
    public AuthServiceImp() {
        authRepository = new AuthRepositoryImp();
    }
    @Override
    public List<User> getAllUsers() {
        return authRepository.getAllUsers();
    }
    @Override
    public boolean addUser(User user) {
        return authRepository.addUser(user);
    }
}
