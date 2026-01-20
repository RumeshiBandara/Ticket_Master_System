package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.example.model.enums.UserTier;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserTier tier;

    private String email;
}

