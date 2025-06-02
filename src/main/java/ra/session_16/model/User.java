package ra.session_16.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.session_16.service.RoleAuth;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private RoleAuth role;
    private boolean status;
}
