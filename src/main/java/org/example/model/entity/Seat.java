package org.example.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.example.model.enums.SeatStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "seats")
@Data
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private String seatNumber;

    @Enumerated(EnumType.STRING)
    private SeatStatus status = SeatStatus.AVAILABLE;

    private Long heldByUserId;

    private LocalDateTime holdExpiry;

    @Version
    private int version;
}
