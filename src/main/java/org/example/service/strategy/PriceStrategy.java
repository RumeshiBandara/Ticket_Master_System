package org.example.service.strategy;

import org.example.model.entity.Event;
import org.example.model.entity.User;

public interface PriceStrategy {
    double calculate(User user, Event event);
}
