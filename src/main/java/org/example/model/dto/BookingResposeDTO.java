package org.example.model.dto;

import lombok.Data;

@Data
public class BookingResposeDTO {
    private Long bookingId;
    private double amountPaid;
    private String status;
    private boolean priorityAccess;
}
