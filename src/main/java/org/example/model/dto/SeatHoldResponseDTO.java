package org.example.model.dto;

import lombok.Data;

@Data
public class SeatHoldResponseDTO {
    private String message;
    private Long seatId;
    private String status;
}
