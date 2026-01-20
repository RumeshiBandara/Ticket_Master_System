package org.example.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "events")
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "base_price")
    private double basePrice;

    @Column(name = "is_high_demand")
    private boolean isHighDemand;

    private LocalDate eventDate;
}
