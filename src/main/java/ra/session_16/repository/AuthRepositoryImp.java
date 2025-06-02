package ra.session_16.repository;

import org.springframework.stereotype.Repository;
import ra.session_16.utils.ConnectionDB;
import ra.session_16.model.User;
import ra.session_16.service.RoleAuth;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthRepositoryImp implements AuthRepository {
    @Override
    public List<User> getAllUsers() {
        Connection conn = null;
        CallableStatement cstmt = null;
        List<User> users = new ArrayList<User>();
        try{
            conn = ConnectionDB.openConnection();
            cstmt = conn.prepareCall("{call get_all_users()}");
            ResultSet rs = cstmt.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setRole(RoleAuth.valueOf(rs.getString("role")));
                users.add(user);
            }
            return users;
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return null;
    }
    @Override
    public boolean addUser(User user) {
        Connection conn = null;
        CallableStatement cstmt = null;
        try {
            conn = ConnectionDB.openConnection();
            cstmt = conn.prepareCall("{call add_new_user(?, ?, ?)}");
            cstmt.setString(1, user.getUsername());
            cstmt.setString(2, user.getPassword());
            cstmt.setString(3, user.getEmail());
            int rowsAffected = cstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return false;
    }
}
