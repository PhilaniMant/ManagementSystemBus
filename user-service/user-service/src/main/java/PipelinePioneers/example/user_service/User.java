package PipelinePioneers.example.user_service;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
// Assuming this is the User class structure
public class User {
    private String username;
    private String password;
    private Role role; // Add this field to store the role

    // Other fields and methods

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }
}