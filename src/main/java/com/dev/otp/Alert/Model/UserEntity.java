package com.dev.otp.Alert.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="user_entity")

public class UserEntity {
    @Id
    @Column(name="email")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String email;

}
